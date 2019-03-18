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


package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class ImportSwaggerRequest extends RpcAcsRequest<ImportSwaggerResponse> {

    public ImportSwaggerRequest() {
        super("CloudAPI", "2016-07-14", "ImportSwagger", "apigateway");
    }

    private Boolean bOverwrite;

    private String dataFormat;

    private String data;

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
        putQueryParameter("GroupId", groupId);
    }

    public Boolean getbOverwrite() {
        return bOverwrite;
    }

    public void setbOverwrite(Boolean bOverwrite) {
        this.bOverwrite = bOverwrite;
        putQueryParameter("Overwrite", bOverwrite);
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        putQueryParameter("DataFormat", dataFormat);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        putQueryParameter("Data", data);
    }

    @Override
    public Class<ImportSwaggerResponse> getResponseClass() {
        return ImportSwaggerResponse.class;
    }

}
