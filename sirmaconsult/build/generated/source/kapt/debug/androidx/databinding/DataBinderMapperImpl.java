package androidx.databinding;

import java.lang.Throwable;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  static DataBinderMapper sTestOverride;

  static {
    try {
      sTestOverride = (DataBinderMapper) DataBinderMapper.class.getClassLoader().loadClass("androidx.databinding.TestDataBinderMapperImpl").newInstance();
    } catch(Throwable ignored) {
      sTestOverride = null;
    }
  }

  DataBinderMapperImpl() {
    addMapper(new com.example.sirmaconsult.DataBinderMapperImpl());
    if(sTestOverride != null) {
      addMapper(sTestOverride);
    }
  }
}
