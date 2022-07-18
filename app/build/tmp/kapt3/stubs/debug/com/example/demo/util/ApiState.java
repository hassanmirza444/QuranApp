package com.example.demo.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/demo/util/ApiState;", "", "()V", "Empty", "Failure", "Loading", "Success", "Lcom/example/demo/util/ApiState$Loading;", "Lcom/example/demo/util/ApiState$Failure;", "Lcom/example/demo/util/ApiState$Success;", "Lcom/example/demo/util/ApiState$Empty;", "app_debug"})
public abstract class ApiState {
    
    private ApiState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/demo/util/ApiState$Loading;", "Lcom/example/demo/util/ApiState;", "()V", "app_debug"})
    public static final class Loading extends com.example.demo.util.ApiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.demo.util.ApiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/demo/util/ApiState$Failure;", "Lcom/example/demo/util/ApiState;", "msg", "", "(Ljava/lang/Throwable;)V", "getMsg", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Failure extends com.example.demo.util.ApiState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable msg = null;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable msg) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getMsg() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/demo/util/ApiState$Success;", "R", "Lcom/example/demo/util/ApiState;", "result", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<R extends java.lang.Object> extends com.example.demo.util.ApiState {
        private final R result = null;
        
        public Success(R result) {
            super();
        }
        
        public final R getResult() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/demo/util/ApiState$Empty;", "Lcom/example/demo/util/ApiState;", "()V", "app_debug"})
    public static final class Empty extends com.example.demo.util.ApiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.demo.util.ApiState.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
}