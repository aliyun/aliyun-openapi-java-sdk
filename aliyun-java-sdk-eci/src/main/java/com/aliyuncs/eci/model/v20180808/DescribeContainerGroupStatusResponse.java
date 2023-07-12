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
import com.aliyuncs.eci.transform.v20180808.DescribeContainerGroupStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;


/**
 * @author xiaohui
 * @version 1.3.0
 */

public class DescribeContainerGroupStatusResponse extends AcsResponse {

    private String requestId;

    private String nextToken;

    private Integer totalCount;

    private List<Data> datas;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Data> getDatas() {
        return this.datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    public static class Data {

        private String containerGroupId;

        private String name;

        private String namespace;

        private String status;

        private String uuid;

        private PodStatus podStatus;

        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        public void setContainerGroupId(String containerGroupId) {
            this.containerGroupId = containerGroupId;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNamespace() {
            return this.namespace;
        }

        public void setNamespace(String namespace) {
            this.namespace = namespace;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUuid() {
            return this.uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public PodStatus getPodStatus() {
            return this.podStatus;
        }

        public void setPodStatus(PodStatus podStatus) {
            this.podStatus = podStatus;
        }

        public static class PodStatus {

            private List<Condition> conditions;

            private List<ContainerStatus> containerStatuses;

            private List<ContainerStatus> ephemeralContainerStatuses;

            private List<ContainerStatus> initContainerStatuses;

            private String message;

            private String nominatedNodeName;

            private String hostIp;

            private String phase;

            private String podIp;

            private List<PodIp> podIps;

            private String qosClass;

            private String reason;

            private String startTime;

            public List<Condition> getConditions() {
                return this.conditions;
            }

            public void setConditions(List<Condition> conditions) {
                this.conditions = conditions;
            }

            public List<ContainerStatus> getContainerStatuses() {
                return this.containerStatuses;
            }

            public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
                this.containerStatuses = containerStatuses;
            }

            public List<ContainerStatus> getEphemeralContainerStatuses() {
                return this.ephemeralContainerStatuses;
            }

            public void setEphemeralContainerStatuses(List<ContainerStatus> ephemeralContainerStatuses) {
                this.ephemeralContainerStatuses = ephemeralContainerStatuses;
            }

            public List<ContainerStatus> getInitContainerStatuses() {
                return this.initContainerStatuses;
            }

            public void setInitContainerStatuses(List<ContainerStatus> initContainerStatuses) {
                this.initContainerStatuses = initContainerStatuses;
            }

            public String getMessage() {
                return this.message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getNominatedNodeName() {
                return this.nominatedNodeName;
            }

            public void setNominatedNodeName(String nominatedNodeName) {
                this.nominatedNodeName = nominatedNodeName;
            }

            public String getReason() {
                return this.reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public String getHostIp() {
                return this.hostIp;
            }

            public void setHostIp(String hostIp) {
                this.hostIp = hostIp;
            }

            public String getPhase() {
                return this.phase;
            }

            public void setPhase(String phase) {
                this.phase = phase;
            }

            public String getPodIp() {
                return this.podIp;
            }

            public void setPodIp(String podIp) {
                this.podIp = podIp;
            }

            public List<PodIp> getPodIps() {
                return this.podIps;
            }

            public void setPodIps(List<PodIp> podIps) {
                this.podIps = podIps;
            }

            public String getQosClass() {
                return this.qosClass;
            }

            public void setQosClass(String qosClass) {
                this.qosClass = qosClass;
            }

            public String getStartTime() {
                return this.startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public static class Condition {

                private String type;

                private String status;

                private String reason;

                private String message;

                private String lastTransitionTime;

                public String getType() {
                    return this.type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getStatus() {
                    return this.status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getReason() {
                    return this.reason;
                }

                public void setReason(String reason) {
                    this.reason = reason;
                }

                public String getMessage() {
                    return this.message;
                }

                public void setMessage(String message) {
                    this.message = message;
                }

                public String getLastTransitionTime() {
                    return this.lastTransitionTime;
                }

                public void setLastTransitionTime(String lastTransitionTime) {
                    this.lastTransitionTime = lastTransitionTime;
                }
            }

            public static class ContainerStatus {

                private String containerID;

                private String image;

                private String imageID;

                private String name;

                private Boolean ready;

                private Integer restartCount;

                private Boolean started;

                private State state;

                private State lastState;

                public String getContainerID() {
                    return this.containerID;
                }

                public void setContainerID(String containerID) {
                    this.containerID = containerID;
                }

                public String getImage() {
                    return this.image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getImageID() {
                    return this.imageID;
                }

                public void setImageID(String imageID) {
                    this.imageID = imageID;
                }

                public String getName() {
                    return this.name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Integer getRestartCount() {
                    return this.restartCount;
                }

                public void setRestartCount(Integer restartCount) {
                    this.restartCount = restartCount;
                }

                public Boolean getReady() {
                    return ready;
                }

                public void setReady(Boolean ready) {
                    this.ready = ready;
                }

                public Boolean getStarted() {
                    return started;
                }

                public void setStarted(Boolean started) {
                    this.started = started;
                }

                public State getState() {
                    return this.state;
                }

                public void setState(State state) {
                    this.state = state;
                }

                public State getLastState() {
                    return this.lastState;
                }

                public void setLastState(State lastState) {
                    this.lastState = lastState;
                }

                public static class State {

                    private Waiting waiting;

                    private Running running;

                    private Terminated terminated;

                    public Waiting getWaiting() {
                        return this.waiting;
                    }

                    public void setWaiting(Waiting waiting) {
                        this.waiting = waiting;
                    }

                    public Running getRunning() {
                        return this.running;
                    }

                    public void setRunning(Running running) {
                        this.running = running;
                    }

                    public Terminated getTerminated() {
                        return this.terminated;
                    }

                    public void setTerminated(Terminated terminated) {
                        this.terminated = terminated;
                    }

                    public static class Waiting {

                        private String reason;

                        private String message;

                        public String getReason() {
                            return this.reason;
                        }

                        public void setReason(String reason) {
                            this.reason = reason;
                        }

                        public String getMessage() {
                            return this.message;
                        }

                        public void setMessage(String message) {
                            this.message = message;
                        }
                    }

                    public static class Running {

                        private String startedAt;

                        public String getStartedAt() {
                            return this.startedAt;
                        }

                        public void setStartedAt(String startedAt) {
                            this.startedAt = startedAt;
                        }
                    }

                    public static class Terminated {

                        private String containerID;

                        private Integer exitCode;

                        private String finishedAt;

                        private String startedAt;

                        private Integer signal;

                        private String reason;

                        private String message;

                        public String getContainerID() {
                            return this.containerID;
                        }

                        public void setContainerID(String containerID) {
                            this.containerID = containerID;
                        }

                        public Integer getExitCode() {
                            return this.exitCode;
                        }

                        public void setExitCode(Integer exitCode) {
                            this.exitCode = exitCode;
                        }

                        public String getFinishedAt() {
                            return this.finishedAt;
                        }

                        public void setFinishedAt(String finishedAt) {
                            this.finishedAt = finishedAt;
                        }

                        public String getStartedAt() {
                            return this.startedAt;
                        }

                        public void setStartedAt(String startedAt) {
                            this.startedAt = startedAt;
                        }

                        public Integer getSignal() {
                            return this.signal;
                        }

                        public void setSignal(Integer signal) {
                            this.signal = signal;
                        }

                        public String getReason() {
                            return this.reason;
                        }

                        public void setReason(String reason) {
                            this.reason = reason;
                        }

                        public String getMessage() {
                            return this.message;
                        }

                        public void setMessage(String message) {
                            this.message = message;
                        }
                    }

                }

            }

            public static class PodIp {

                private String ip;

                public String getIp() {
                    return this.ip;
                }

                public void setIp(String ip) {
                    this.ip = ip;
                }
            }

        }

    }


    @Override
    public DescribeContainerGroupStatusResponse getInstance(UnmarshallerContext context) {
        return DescribeContainerGroupStatusResponseUnmarshaller.unmarshall(this, context);
    }

    @Override
    public boolean checkShowJsonItemName() {
        return false;
    }
}
