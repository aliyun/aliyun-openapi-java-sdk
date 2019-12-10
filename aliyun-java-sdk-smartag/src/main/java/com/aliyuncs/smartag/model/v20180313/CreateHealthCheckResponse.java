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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.CreateHealthCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateHealthCheckResponse extends AcsResponse {

	private String requestId;

	private Long createTime;

	private String instanceId;

	private String smartAGId;

	private String name;

	private String regionId;

	private String description;

	private String type;

	private String dstIpAddr;

	private Integer dstPort;

	private String srcIpAddr;

	private Integer srcPort;

	private Integer probeInterval;

	private Integer probeCount;

	private Integer probeTimeout;

	private Integer rttThreshold;

	private Integer rttFailThreshold;

	private Integer failCountThreshold;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDstIpAddr() {
		return this.dstIpAddr;
	}

	public void setDstIpAddr(String dstIpAddr) {
		this.dstIpAddr = dstIpAddr;
	}

	public Integer getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(Integer dstPort) {
		this.dstPort = dstPort;
	}

	public String getSrcIpAddr() {
		return this.srcIpAddr;
	}

	public void setSrcIpAddr(String srcIpAddr) {
		this.srcIpAddr = srcIpAddr;
	}

	public Integer getSrcPort() {
		return this.srcPort;
	}

	public void setSrcPort(Integer srcPort) {
		this.srcPort = srcPort;
	}

	public Integer getProbeInterval() {
		return this.probeInterval;
	}

	public void setProbeInterval(Integer probeInterval) {
		this.probeInterval = probeInterval;
	}

	public Integer getProbeCount() {
		return this.probeCount;
	}

	public void setProbeCount(Integer probeCount) {
		this.probeCount = probeCount;
	}

	public Integer getProbeTimeout() {
		return this.probeTimeout;
	}

	public void setProbeTimeout(Integer probeTimeout) {
		this.probeTimeout = probeTimeout;
	}

	public Integer getRttThreshold() {
		return this.rttThreshold;
	}

	public void setRttThreshold(Integer rttThreshold) {
		this.rttThreshold = rttThreshold;
	}

	public Integer getRttFailThreshold() {
		return this.rttFailThreshold;
	}

	public void setRttFailThreshold(Integer rttFailThreshold) {
		this.rttFailThreshold = rttFailThreshold;
	}

	public Integer getFailCountThreshold() {
		return this.failCountThreshold;
	}

	public void setFailCountThreshold(Integer failCountThreshold) {
		this.failCountThreshold = failCountThreshold;
	}

	@Override
	public CreateHealthCheckResponse getInstance(UnmarshallerContext context) {
		return	CreateHealthCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
