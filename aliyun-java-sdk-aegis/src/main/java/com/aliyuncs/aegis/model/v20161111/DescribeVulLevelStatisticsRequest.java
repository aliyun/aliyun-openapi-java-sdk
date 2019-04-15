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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulLevelStatisticsRequest extends RpcAcsRequest<DescribeVulLevelStatisticsResponse> {
	
	public DescribeVulLevelStatisticsRequest() {
		super("aegis", "2016-11-11", "DescribeVulLevelStatistics", "vipaegis");
	}

	private String sourceIp;

	private Long endTs;

	private Long startTs;

	private String uuids;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getEndTs() {
		return this.endTs;
	}

	public void setEndTs(Long endTs) {
		this.endTs = endTs;
		if(endTs != null){
			putQueryParameter("EndTs", endTs.toString());
		}
	}

	public Long getStartTs() {
		return this.startTs;
	}

	public void setStartTs(Long startTs) {
		this.startTs = startTs;
		if(startTs != null){
			putQueryParameter("StartTs", startTs.toString());
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<DescribeVulLevelStatisticsResponse> getResponseClass() {
		return DescribeVulLevelStatisticsResponse.class;
	}

}
