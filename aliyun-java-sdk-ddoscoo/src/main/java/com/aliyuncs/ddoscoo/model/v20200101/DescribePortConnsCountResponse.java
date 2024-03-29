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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortConnsCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortConnsCountResponse extends AcsResponse {

	private Long inActConns;

	private Long actConns;

	private String requestId;

	private Long cps;

	private Long conns;

	public Long getInActConns() {
		return this.inActConns;
	}

	public void setInActConns(Long inActConns) {
		this.inActConns = inActConns;
	}

	public Long getActConns() {
		return this.actConns;
	}

	public void setActConns(Long actConns) {
		this.actConns = actConns;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCps() {
		return this.cps;
	}

	public void setCps(Long cps) {
		this.cps = cps;
	}

	public Long getConns() {
		return this.conns;
	}

	public void setConns(Long conns) {
		this.conns = conns;
	}

	@Override
	public DescribePortConnsCountResponse getInstance(UnmarshallerContext context) {
		return	DescribePortConnsCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
