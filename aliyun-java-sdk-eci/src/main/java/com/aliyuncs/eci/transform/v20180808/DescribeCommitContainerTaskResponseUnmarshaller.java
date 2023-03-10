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

package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.DescribeCommitContainerTaskResponse;
import com.aliyuncs.eci.model.v20180808.DescribeCommitContainerTaskResponse.CommitTask;
import com.aliyuncs.eci.model.v20180808.DescribeCommitContainerTaskResponse.CommitTask.CommitPhaseInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.6
 */
public class DescribeCommitContainerTaskResponseUnmarshaller {
    public static DescribeCommitContainerTaskResponse unmarshall(DescribeCommitContainerTaskResponse describeCommitContainerTaskResponse, UnmarshallerContext context) {

        describeCommitContainerTaskResponse.setTotalCount(context.integerValue("DescribeCommitContainerTaskResponse.TotalCount"));
        describeCommitContainerTaskResponse.setRequestId(context.stringValue("DescribeCommitContainerTaskResponse.RequestId"));
        describeCommitContainerTaskResponse.setNextToken(context.stringValue("DescribeCommitContainerTaskResponse.NextToken"));
        describeCommitContainerTaskResponse.setMaxResults(context.stringValue("DescribeCommitContainerTaskResponse.MaxResults"));

        List<CommitTask> commitTasks = new ArrayList<CommitTask>();
        for (int i = 0; i < context.lengthValue("DescribeCommitContainerTaskResponse.CommitTasks.Length"); i++) {
            CommitTask commitTask = new CommitTask();
            commitTask.setTaskId(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].TaskId"));
            commitTask.setTaskStatus(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].TaskStatus"));
            commitTask.setTaskProgress(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].TaskProgress"));
            commitTask.setCreationTime(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CreationTime"));
            commitTask.setFinishedTime(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].FinishedTime"));
            commitTask.setStatusMessage(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].StatusMessage"));
            commitTask.setContainerName(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].ContainerName"));

            List<CommitPhaseInfo> commitPhaseInfos = new ArrayList<CommitPhaseInfo>();
            for (int j = 0; j < context.lengthValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CommitPhaseInfos.Length"); j++) {
                CommitPhaseInfo commitPhaseInfo = new CommitPhaseInfo();
                commitPhaseInfo.setPhase(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CommitPhaseInfos[" + j + "].Phase"));
                commitPhaseInfo.setStatus(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CommitPhaseInfos[" + j + "].Status"));
                commitPhaseInfo.setMessage(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CommitPhaseInfos[" + j + "].Message"));
                commitPhaseInfo.setRecordTime(context.stringValue("DescribeCommitContainerTaskResponse.CommitTasks[" + i +"].CommitPhaseInfos[" + j + "].RecordTime"));
                commitPhaseInfos.add(commitPhaseInfo);
            }
            commitTask.setCommitPhaseInfos(commitPhaseInfos);
            commitTasks.add(commitTask);
        }
        describeCommitContainerTaskResponse.setCommitTasks(commitTasks);

        return describeCommitContainerTaskResponse;
    }
}
