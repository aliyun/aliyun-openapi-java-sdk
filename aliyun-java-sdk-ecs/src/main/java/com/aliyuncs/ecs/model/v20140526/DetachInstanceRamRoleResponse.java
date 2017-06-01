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
package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DetachInstanceRamRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version
 */
public class DetachInstanceRamRoleResponse extends AcsResponse {

    private String requestId;

    private Integer totalCount;

    private Integer failCount;

    private String ramRoleName;

    private List<DetachInstanceRamRoleResult> detachInstanceRamRoleResults;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getFailCount() {
        return this.failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public void setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
    }

    public List<DetachInstanceRamRoleResult> getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    public void setDetachInstanceRamRoleResults(List<DetachInstanceRamRoleResult> detachInstanceRamRoleResults) {
        this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
    }

    public static class DetachInstanceRamRoleResult {

        private String instanceId;

        private Boolean success;

        private Code code;

        private String message;

        public String getInstanceId() {
            return this.instanceId;
        }

        public void setInstanceId(String instanceId) {
            this.instanceId = instanceId;
        }

        public Boolean getSuccess() {
            return this.success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Code getCode() {
            return this.code;
        }

        public void setCode(Code code) {
            this.code = code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public enum Code {

            INSTANCE_RAM_ROLE_NOT_ATTACHED("InvalidRamRole.NotAttached"),;

            private String stringValue;

            Code(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static Code getEnum(String stringValue){
                if(null == stringValue){
                    return null;
                }

                for (Code code : Code.values()) {
                    if(code.getStringValue().equals(stringValue)){
                        return code;
                    }
                }
                return null;
            }
        }
    }

    @Override
    public DetachInstanceRamRoleResponse getInstance(UnmarshallerContext context) {
        return	DetachInstanceRamRoleResponseUnmarshaller.unmarshall(this, context);
    }
}
