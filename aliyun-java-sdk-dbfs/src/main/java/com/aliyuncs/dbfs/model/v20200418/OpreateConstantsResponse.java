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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.OpreateConstantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpreateConstantsResponse extends AcsResponse {

	private Long totalCount;

	private String masterData;

	private Long pageSize;

	private String zoneData;

	private String requestId;

	private Long pageNumber;

	private String accessData;

	private String productCodeData;

	private String osversionData;

	private String data;

	private String regionData;

	private String endpointData;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getMasterData() {
		return this.masterData;
	}

	public void setMasterData(String masterData) {
		this.masterData = masterData;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getZoneData() {
		return this.zoneData;
	}

	public void setZoneData(String zoneData) {
		this.zoneData = zoneData;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAccessData() {
		return this.accessData;
	}

	public void setAccessData(String accessData) {
		this.accessData = accessData;
	}

	public String getProductCodeData() {
		return this.productCodeData;
	}

	public void setProductCodeData(String productCodeData) {
		this.productCodeData = productCodeData;
	}

	public String getOsversionData() {
		return this.osversionData;
	}

	public void setOsversionData(String osversionData) {
		this.osversionData = osversionData;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRegionData() {
		return this.regionData;
	}

	public void setRegionData(String regionData) {
		this.regionData = regionData;
	}

	public String getEndpointData() {
		return this.endpointData;
	}

	public void setEndpointData(String endpointData) {
		this.endpointData = endpointData;
	}

	@Override
	public OpreateConstantsResponse getInstance(UnmarshallerContext context) {
		return	OpreateConstantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
