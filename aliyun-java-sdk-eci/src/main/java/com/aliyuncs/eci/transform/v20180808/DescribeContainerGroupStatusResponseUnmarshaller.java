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


import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupStatusResponse;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupStatusResponse.Data;
import com.aliyuncs.eci.model.v20180808.DescribeContainerGroupStatusResponse.Data.PodStatus;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.3.9
 */

public class DescribeContainerGroupStatusResponseUnmarshaller {

    public static DescribeContainerGroupStatusResponse unmarshall(DescribeContainerGroupStatusResponse describeContainerGroupStatusResponse, UnmarshallerContext context) {

        describeContainerGroupStatusResponse.setRequestId(context.stringValue("DescribeContainerGroupStatusResponse.RequestId"));
        describeContainerGroupStatusResponse.setNextToken(context.stringValue("DescribeContainerGroupStatusResponse.NextToken"));
        describeContainerGroupStatusResponse.setTotalCount(context.integerValue("DescribeContainerGroupStatusResponse.TotalCount"));

        List<Data> datas = new ArrayList<Data>();
        for (int i = 0; i < context.lengthValue("DescribeContainerGroupStatusResponse.Data.Length"); i++) {
            Data data = new Data();
            data.setContainerGroupId(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].containerGroupId"));
            data.setName(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].name"));
            data.setNamespace(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].namespace"));
            data.setStatus(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].status"));
            data.setUuid(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].uuid"));

            PodStatus podStatus = new PodStatus();
            List<PodStatus.Condition> conditions = new ArrayList<PodStatus.Condition>();
            for (int j = 0; j < context.lengthValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions.Length"); j++) {
                PodStatus.Condition condition = new PodStatus.Condition();
                condition.setLastTransitionTime(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions[" + j + "].lastTransitionTime"));
                condition.setMessage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions[" + j + "].message"));
                condition.setReason(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions[" + j + "].reason"));
                condition.setStatus(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions[" + j + "].status"));
                condition.setType(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.conditions[" + j + "].type"));
                conditions.add(condition);
            }

            List<PodStatus.ContainerStatus> containerStatuses = new ArrayList<PodStatus.ContainerStatus>();
            for (int j = 0; j < context.lengthValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses.Length"); j++) {
                PodStatus.ContainerStatus containerStatus = new PodStatus.ContainerStatus();
                containerStatus.setImage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].image"));
                containerStatus.setImageId(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].imageID"));
                containerStatus.setName(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].name"));
                containerStatus.setReady(context.booleanValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].ready"));
                containerStatus.setRestartCount(context.integerValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].restartCount"));
                containerStatus.setStarted(context.booleanValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].started"));

                PodStatus.ContainerStatus.State state = new PodStatus.ContainerStatus.State();
                PodStatus.ContainerStatus.State.Running running = new PodStatus.ContainerStatus.State.Running();
                running.setStartedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.running.startedAt"));
                state.setRunning(running);

                PodStatus.ContainerStatus.State.Terminated terminated = new PodStatus.ContainerStatus.State.Terminated();
                terminated.setContainerID(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.containerID"));
                terminated.setExitCode(context.integerValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.exitCode"));
                terminated.setFinishedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.finishedAt"));
                terminated.setMessage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.message"));
                terminated.setReason(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.reason"));
                terminated.setSignal(context.integerValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.signal"));
                terminated.setStartedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.terminated.startedAt"));
                state.setTerminated(terminated);

                PodStatus.ContainerStatus.State.Waiting waiting = new PodStatus.ContainerStatus.State.Waiting();
                waiting.setMessage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.waiting.message"));
                waiting.setReason(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].state.waiting.reason"));
                state.setWaiting(waiting);

                containerStatus.setState(state);

                PodStatus.ContainerStatus.State lastState = new PodStatus.ContainerStatus.State();
                PodStatus.ContainerStatus.State.Running lastRunning = new PodStatus.ContainerStatus.State.Running();
                lastRunning.setStartedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.running.startedAt"));
                lastState.setRunning(lastRunning);

                PodStatus.ContainerStatus.State.Terminated lastTerminated = new PodStatus.ContainerStatus.State.Terminated();
                lastTerminated.setContainerID(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.containerID"));
                lastTerminated.setExitCode(context.integerValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.exitCode"));
                lastTerminated.setFinishedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.finishedAt"));
                lastTerminated.setMessage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.message"));
                lastTerminated.setReason(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.reason"));
                lastTerminated.setSignal(context.integerValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.signal"));
                lastTerminated.setStartedAt(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.terminated.startedAt"));
                lastState.setTerminated(lastTerminated);

                PodStatus.ContainerStatus.State.Waiting lastWaiting = new PodStatus.ContainerStatus.State.Waiting();
                lastWaiting.setMessage(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.waiting.message"));
                lastWaiting.setReason(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.containerStatuses[" + j + "].lastState.waiting.reason"));
                lastState.setWaiting(lastWaiting);

                containerStatus.setLastState(lastState);

                containerStatuses.add(containerStatus);
            }
            List<PodStatus.PodIp> podIps = new ArrayList<PodStatus.PodIp>();
            for (int j = 0; j < context.lengthValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.podIPs.Length"); j++) {
                PodStatus.PodIp podIp = new PodStatus.PodIp();
                podIp.setIp(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.podIPs[" + j + "].ip"));
                podIps.add(podIp);
            }

            podStatus.setConditions(conditions);
            podStatus.setContainerStatuses(containerStatuses);
            podStatus.setPodIps(podIps);
            podStatus.setHostIp(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.hostIP"));
            podStatus.setPhase(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.phase"));
            podStatus.setPodIp(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.podIP"));
            podStatus.setQosClass(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.qosClass"));
            podStatus.setStartTime(context.stringValue("DescribeContainerGroupStatusResponse.Data[" + i + "].podStatus.startTime"));

            data.setPodStatus(podStatus);
            datas.add(data);
        }
        describeContainerGroupStatusResponse.setData(datas);

        return describeContainerGroupStatusResponse;
    }
}
