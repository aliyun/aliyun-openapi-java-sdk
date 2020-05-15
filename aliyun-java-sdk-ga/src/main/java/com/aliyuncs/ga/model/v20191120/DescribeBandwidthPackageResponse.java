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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.DescribeBandwidthPackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBandwidthPackageResponse extends AcsResponse {

	private String requestId;

	private String bandwidthPackageId;

	private String name;

	private String description;

	private String state;

	private Integer bandwidth;

	private String chargeType;

	private String expiredTime;

	private String createTime;

	private String regionId;

	private String type;

	private String bandwidthType;

	private String cbnGeographicRegionIdA;

	private String cbnGeographicRegionIdB;

	private List<String> accelerators;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBandwidthType() {
		return this.bandwidthType;
	}

	public void setBandwidthType(String bandwidthType) {
		this.bandwidthType = bandwidthType;
	}

	public String getCbnGeographicRegionIdA() {
		return this.cbnGeographicRegionIdA;
	}

	public void setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
		this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
	}

	public String getCbnGeographicRegionIdB() {
		return this.cbnGeographicRegionIdB;
	}

	public void setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
		this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
	}

	public List<String> getAccelerators() {
		return this.accelerators;
	}

	public void setAccelerators(List<String> accelerators) {
		this.accelerators = accelerators;
	}

	@Override
	public DescribeBandwidthPackageResponse getInstance(UnmarshallerContext context) {
		return	DescribeBandwidthPackageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
