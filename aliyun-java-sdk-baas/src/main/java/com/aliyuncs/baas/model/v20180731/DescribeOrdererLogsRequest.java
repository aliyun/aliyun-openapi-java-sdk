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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrdererLogsRequest extends RpcAcsRequest<DescribeOrdererLogsResponse> {
	
	public DescribeOrdererLogsRequest() {
		super("Baas", "2018-07-31", "DescribeOrdererLogs");
	}

	private String lines;

	private String consortiumId;

	private String ordererName;

	public String getLines() {
		return this.lines;
	}

	public void setLines(String lines) {
		this.lines = lines;
		if(lines != null){
			putQueryParameter("Lines", lines);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putQueryParameter("ConsortiumId", consortiumId);
		}
	}

	public String getOrdererName() {
		return this.ordererName;
	}

	public void setOrdererName(String ordererName) {
		this.ordererName = ordererName;
		if(ordererName != null){
			putQueryParameter("OrdererName", ordererName);
		}
	}

	@Override
	public Class<DescribeOrdererLogsResponse> getResponseClass() {
		return DescribeOrdererLogsResponse.class;
	}

}
