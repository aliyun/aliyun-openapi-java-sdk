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

import com.aliyuncs.RpcAcsRequest;

import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.6
 */
public class DescribeCommitContainerTaskRequest extends RpcAcsRequest<DescribeCommitContainerTaskResponse>{
    public DescribeCommitContainerTaskRequest() {
        super("Eci", "2018-08-08", "DescribeCommitContainerTask", "eci");
    }

    private String containerGroupId;

    private String taskStatus;

    private Integer maxResults;

    private String nextToken;

    private List<String> taskId;

    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public void setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        if (null != containerGroupId) {
            putQueryParameter("ContainerGroupId", containerGroupId);
        }
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        if (null != taskStatus) {
            putQueryParameter("TaskStatus", taskStatus);
        }
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        if (null != maxResults) {
            putQueryParameter("MaxResults", maxResults);
        }
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
        if (null != nextToken) {
            putQueryParameter("NextToken", nextToken);
        }
    }

    public List<String> getTaskId() {
        return this.taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
        if (null != taskId) {
            for (int i = 0; i < taskId.size(); i++) {
                putQueryParameter("TaskId." + (i + 1), taskId.get(i));
            }
        }
    }

    @Override
    public Class<DescribeCommitContainerTaskResponse> getResponseClass() {
        return DescribeCommitContainerTaskResponse.class;
    }
}
