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
package com.aliyuncs.v20150814;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class CreateDBSourceRequest extends RoaAcsRequest<CreateDBSourceResponse> {

    public CreateDBSourceRequest() {
        super("Cms", "2015-08-14", "CreateDBSource");
        setUriPattern("/projects/[ProjectName]/sources");
        setMethod(MethodType.POST);
    }

    private String projectName;

    private String source;

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
        putPathParameter("ProjectName", projectName);
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Class<CreateDBSourceResponse> getResponseClass() {
        return CreateDBSourceResponse.class;
    }

}
