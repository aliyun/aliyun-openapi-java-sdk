/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.publicopinion.model.v20170731;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.publicopinion.transform.v20170731.CreateKeywordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 */
public class CreateKeywordResponse extends AcsResponse {

    private String traceId;

    private Integer errCode;

    private Long result;

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Integer getErrCode() {
        return this.errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    @Override
    public CreateKeywordResponse getInstance(UnmarshallerContext context) {
        return CreateKeywordResponseUnmarshaller.unmarshall(this, context);
    }
}
