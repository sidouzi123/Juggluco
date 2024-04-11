LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := g
LOCAL_SRC_FILES := /Users/pangwei/AndroidStudioProjects/Juggluco/Common/build/intermediates/cxx/RelWithDebInfo/474d3z6b/obj/x86/libg.so
LOCAL_CPP_FEATURES := rtti exceptions
LOCAL_EXPORT_LDLIBS := -lc++_static -lc -llog -lGLESv3 -landroid -lEGL -lm -latomic -lz -ldl
include $(PREBUILT_SHARED_LIBRARY)

