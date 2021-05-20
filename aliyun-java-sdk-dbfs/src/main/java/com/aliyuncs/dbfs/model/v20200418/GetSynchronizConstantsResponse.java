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
import com.aliyuncs.dbfs.transform.v20200418.GetSynchronizConstantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSynchronizConstantsResponse extends AcsResponse {

	private String requestId;

	private String data;

	private Long pageSize;

	private Long totalCount;

	private Long pageNumber;

	private String regionData;

	private String zoneData;

	private String osversionData;

	private String productCodeData;

	private String masterData;

	private String endpointData;

	private String accessData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRegionData() {
		return this.regionData;
	}

	public void setRegionData(String regionData) {
		this.regionData = regionData;
	}

	public String getZoneData() {
		return this.zoneData;
	}

	public void setZoneData(String zoneData) {
		this.zoneData = zoneData;
	}

	public String getOsversionData() {
		return this.osversionData;
	}

	public void setOsversionData(String osversionData) {
		this.osversionData = osversionData;
	}

	public String getProductCodeData() {
		return this.productCodeData;
	}

	public void setProductCodeData(String productCodeData) {
		this.productCodeData = productCodeData;
	}

	public String getMasterData() {
		return this.masterData;
	}

	public void setMasterData(String masterData) {
		this.masterData = masterData;
	}

	public String getEndpointData() {
		return this.endpointData;
	}

	public void setEndpointData(String endpointData) {
		this.endpointData = endpointData;
	}

	public String getAccessData() {
		return this.accessData;
	}

	public void setAccessData(String accessData) {
		this.accessData = accessData;
	}

	@Override
	public GetSynchronizConstantsResponse getInstance(UnmarshallerContext context) {
		return	GetSynchronizConstantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
