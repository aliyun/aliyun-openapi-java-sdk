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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainQpsWithCacheResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainQpsWithCacheResponse extends AcsResponse {

	private String requestId;

	private Integer interval;

	private Long startTime;

	private List<String> totals;

	private List<String> blocks;

	private List<String> cacheHits;

	private List<String> preciseBlocks;

	private List<String> regionBlocks;

	private List<String> ipBlockQps;

	private List<String> ccJsQps;

	private List<String> preciseJsQps;

	private List<String> ccBlockQps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public List<String> getTotals() {
		return this.totals;
	}

	public void setTotals(List<String> totals) {
		this.totals = totals;
	}

	public List<String> getBlocks() {
		return this.blocks;
	}

	public void setBlocks(List<String> blocks) {
		this.blocks = blocks;
	}

	public List<String> getCacheHits() {
		return this.cacheHits;
	}

	public void setCacheHits(List<String> cacheHits) {
		this.cacheHits = cacheHits;
	}

	public List<String> getPreciseBlocks() {
		return this.preciseBlocks;
	}

	public void setPreciseBlocks(List<String> preciseBlocks) {
		this.preciseBlocks = preciseBlocks;
	}

	public List<String> getRegionBlocks() {
		return this.regionBlocks;
	}

	public void setRegionBlocks(List<String> regionBlocks) {
		this.regionBlocks = regionBlocks;
	}

	public List<String> getIpBlockQps() {
		return this.ipBlockQps;
	}

	public void setIpBlockQps(List<String> ipBlockQps) {
		this.ipBlockQps = ipBlockQps;
	}

	public List<String> getCcJsQps() {
		return this.ccJsQps;
	}

	public void setCcJsQps(List<String> ccJsQps) {
		this.ccJsQps = ccJsQps;
	}

	public List<String> getPreciseJsQps() {
		return this.preciseJsQps;
	}

	public void setPreciseJsQps(List<String> preciseJsQps) {
		this.preciseJsQps = preciseJsQps;
	}

	public List<String> getCcBlockQps() {
		return this.ccBlockQps;
	}

	public void setCcBlockQps(List<String> ccBlockQps) {
		this.ccBlockQps = ccBlockQps;
	}

	@Override
	public DescribeDomainQpsWithCacheResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainQpsWithCacheResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
