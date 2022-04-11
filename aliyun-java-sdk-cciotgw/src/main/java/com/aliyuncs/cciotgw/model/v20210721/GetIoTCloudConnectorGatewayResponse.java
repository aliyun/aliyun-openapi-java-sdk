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

package com.aliyuncs.cciotgw.model.v20210721;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cciotgw.transform.v20210721.GetIoTCloudConnectorGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIoTCloudConnectorGatewayResponse extends AcsResponse {

	private String requestId;

	private String spec;

	private Long resourceUid;

	private String description;

	private String haMode;

	private String state;

	private Map<Object,Object> scheduleFactor;

	private String apn;

	private Integer forwardingUnitCount;

	private String name;

	private String isp;

	private String ioTCloudConnectorGatewayId;

	private List<String> forwardingUnitIds;

	private List<String> featureList;

	private List<String> zoneList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Long getResourceUid() {
		return this.resourceUid;
	}

	public void setResourceUid(Long resourceUid) {
		this.resourceUid = resourceUid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHaMode() {
		return this.haMode;
	}

	public void setHaMode(String haMode) {
		this.haMode = haMode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<Object,Object> getScheduleFactor() {
		return this.scheduleFactor;
	}

	public void setScheduleFactor(Map<Object,Object> scheduleFactor) {
		this.scheduleFactor = scheduleFactor;
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
	}

	public Integer getForwardingUnitCount() {
		return this.forwardingUnitCount;
	}

	public void setForwardingUnitCount(Integer forwardingUnitCount) {
		this.forwardingUnitCount = forwardingUnitCount;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
	}

	public String getIoTCloudConnectorGatewayId() {
		return this.ioTCloudConnectorGatewayId;
	}

	public void setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
		this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
	}

	public List<String> getForwardingUnitIds() {
		return this.forwardingUnitIds;
	}

	public void setForwardingUnitIds(List<String> forwardingUnitIds) {
		this.forwardingUnitIds = forwardingUnitIds;
	}

	public List<String> getFeatureList() {
		return this.featureList;
	}

	public void setFeatureList(List<String> featureList) {
		this.featureList = featureList;
	}

	public List<String> getZoneList() {
		return this.zoneList;
	}

	public void setZoneList(List<String> zoneList) {
		this.zoneList = zoneList;
	}

	@Override
	public GetIoTCloudConnectorGatewayResponse getInstance(UnmarshallerContext context) {
		return	GetIoTCloudConnectorGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
