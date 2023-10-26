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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeSummaryDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSummaryDataResponse extends AcsResponse {

	private String requestId;

	private Integer usageGroupNum;

	private Integer usageInstanceNum;

	private Integer usageApiNum;

	private String region;

	private Integer comeingSoonInstanceNum;

	private Integer expireInstanceNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUsageGroupNum() {
		return this.usageGroupNum;
	}

	public void setUsageGroupNum(Integer usageGroupNum) {
		this.usageGroupNum = usageGroupNum;
	}

	public Integer getUsageInstanceNum() {
		return this.usageInstanceNum;
	}

	public void setUsageInstanceNum(Integer usageInstanceNum) {
		this.usageInstanceNum = usageInstanceNum;
	}

	public Integer getUsageApiNum() {
		return this.usageApiNum;
	}

	public void setUsageApiNum(Integer usageApiNum) {
		this.usageApiNum = usageApiNum;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getComeingSoonInstanceNum() {
		return this.comeingSoonInstanceNum;
	}

	public void setComeingSoonInstanceNum(Integer comeingSoonInstanceNum) {
		this.comeingSoonInstanceNum = comeingSoonInstanceNum;
	}

	public Integer getExpireInstanceNum() {
		return this.expireInstanceNum;
	}

	public void setExpireInstanceNum(Integer expireInstanceNum) {
		this.expireInstanceNum = expireInstanceNum;
	}

	@Override
	public DescribeSummaryDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeSummaryDataResponseUnmarshaller.unmarshall(this, context);
	}
}
