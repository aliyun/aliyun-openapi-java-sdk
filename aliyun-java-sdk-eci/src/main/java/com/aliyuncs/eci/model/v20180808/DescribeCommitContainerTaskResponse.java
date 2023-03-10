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
import com.aliyuncs.eci.transform.v20180808.DescribeCommitContainerTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.6
 */
public class DescribeCommitContainerTaskResponse extends AcsResponse {

    private Integer totalCount;

    private String nextToken;

    private String requestId;

    private String maxResults;

    private List<CommitTask> commitTasks;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMaxResults() {
        return this.maxResults;
    }

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    public List<CommitTask> getCommitTasks() {
        return this.commitTasks;
    }

    public void setCommitTasks(List<CommitTask> commitTasks) {
        this.commitTasks = commitTasks;
    }

    public static class CommitTask {

        private String taskId;

        private String taskStatus;

        private String taskProgress;

        private String creationTime;

        private String finishedTime;

        private String statusMessage;

        private String containerName;

        private List<CommitPhaseInfo> commitPhaseInfos;

        public String getTaskId() {
            return this.taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getTaskStatus() {
            return this.taskStatus;
        }

        public void setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
        }

        public String getTaskProgress() {
            return this.taskProgress;
        }

        public void setTaskProgress(String taskProgress) {
            this.taskProgress = taskProgress;
        }

        public String getCreationTime() {
            return this.creationTime;
        }

        public void setCreationTime(String creationTime) {
            this.creationTime = creationTime;
        }

        public String getFinishedTime() {
            return this.finishedTime;
        }

        public void setFinishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
        }

        public String getStatusMessage() {
            return this.statusMessage;
        }

        public void setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
        }

        public String getContainerName() {
            return this.containerName;
        }

        public void setContainerName(String containerName) {
            this.containerName = containerName;
        }

        public List<CommitPhaseInfo> getCommitPhaseInfos() {
            return this.commitPhaseInfos;
        }

        public void setCommitPhaseInfos(List<CommitPhaseInfo> commitPhaseInfos) {
            this.commitPhaseInfos = commitPhaseInfos;
        }

        public static class CommitPhaseInfo {

            private String phase;

            private String status;

            private String message;

            private String recordTime;

            public String getPhase() {
                return this.phase;
            }

            public void setPhase(String phase) {
                this.phase = phase;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getMessage() {
                return this.message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getRecordTime() {
                return this.recordTime;
            }

            public void setRecordTime(String recordTime) {
                this.recordTime = recordTime;
            }
        }
    }


    @Override
    public DescribeCommitContainerTaskResponse getInstance(UnmarshallerContext context) {
        return	DescribeCommitContainerTaskResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }
}
