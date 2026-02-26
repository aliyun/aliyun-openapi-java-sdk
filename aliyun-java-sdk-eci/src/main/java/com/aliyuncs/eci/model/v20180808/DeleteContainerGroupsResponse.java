/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eci.transform.v20180808.DeleteContainerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;


/**
 * @author xiaohui
 * @version 1.3.9
 */
public class DeleteContainerGroupsResponse extends AcsResponse {

    private String requestId;

    private List<InstanceResponse> instanceResponseSet;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<InstanceResponse> getInstanceResponseSet() {
        return instanceResponseSet;
    }

    public void setInstanceResponseSet(List<InstanceResponse> instanceResponseSet) {
        this.instanceResponseSet = instanceResponseSet;
    }

    public static class InstanceResponse {

        private String containerGroupId;

        private String code;

        private String message;

        public String getContainerGroupId() {
            return containerGroupId;
        }

        public void setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @Override
    public DeleteContainerGroupsResponse getInstance(UnmarshallerContext context) {
        return	DeleteContainerGroupsResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }
}
