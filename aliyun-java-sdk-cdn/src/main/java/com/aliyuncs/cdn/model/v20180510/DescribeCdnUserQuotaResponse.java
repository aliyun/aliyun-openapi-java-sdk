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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnUserQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnUserQuotaResponse extends AcsResponse {

	private Integer blockQuota;

	private Integer refreshUrlRemain;

	private Integer domainQuota;

	private Integer blockRemain;

	private Integer preloadRemain;

	private String requestId;

	private Integer refreshUrlQuota;

	private Integer preloadQuota;

	private Integer refreshDirQuota;

	private Integer refreshDirRemain;

	public Integer getBlockQuota() {
		return this.blockQuota;
	}

	public void setBlockQuota(Integer blockQuota) {
		this.blockQuota = blockQuota;
	}

	public Integer getRefreshUrlRemain() {
		return this.refreshUrlRemain;
	}

	public void setRefreshUrlRemain(Integer refreshUrlRemain) {
		this.refreshUrlRemain = refreshUrlRemain;
	}

	public Integer getDomainQuota() {
		return this.domainQuota;
	}

	public void setDomainQuota(Integer domainQuota) {
		this.domainQuota = domainQuota;
	}

	public Integer getBlockRemain() {
		return this.blockRemain;
	}

	public void setBlockRemain(Integer blockRemain) {
		this.blockRemain = blockRemain;
	}

	public Integer getPreloadRemain() {
		return this.preloadRemain;
	}

	public void setPreloadRemain(Integer preloadRemain) {
		this.preloadRemain = preloadRemain;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getRefreshUrlQuota() {
		return this.refreshUrlQuota;
	}

	public void setRefreshUrlQuota(Integer refreshUrlQuota) {
		this.refreshUrlQuota = refreshUrlQuota;
	}

	public Integer getPreloadQuota() {
		return this.preloadQuota;
	}

	public void setPreloadQuota(Integer preloadQuota) {
		this.preloadQuota = preloadQuota;
	}

	public Integer getRefreshDirQuota() {
		return this.refreshDirQuota;
	}

	public void setRefreshDirQuota(Integer refreshDirQuota) {
		this.refreshDirQuota = refreshDirQuota;
	}

	public Integer getRefreshDirRemain() {
		return this.refreshDirRemain;
	}

	public void setRefreshDirRemain(Integer refreshDirRemain) {
		this.refreshDirRemain = refreshDirRemain;
	}

	@Override
	public DescribeCdnUserQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnUserQuotaResponseUnmarshaller.unmarshall(this, context);
	}
}
