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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmInstanceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmInstanceStatusResponse extends AcsResponse {

	private String requestId;

	private Integer addrNotAvailableNum;

	private Integer addrPoolGroupNotAvailableNum;

	private Integer switchToFailoverStrategyNum;

	private Integer strategyNotAvailableNum;

	private Integer addrAvailableNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAddrNotAvailableNum() {
		return this.addrNotAvailableNum;
	}

	public void setAddrNotAvailableNum(Integer addrNotAvailableNum) {
		this.addrNotAvailableNum = addrNotAvailableNum;
	}

	public Integer getAddrPoolGroupNotAvailableNum() {
		return this.addrPoolGroupNotAvailableNum;
	}

	public void setAddrPoolGroupNotAvailableNum(Integer addrPoolGroupNotAvailableNum) {
		this.addrPoolGroupNotAvailableNum = addrPoolGroupNotAvailableNum;
	}

	public Integer getSwitchToFailoverStrategyNum() {
		return this.switchToFailoverStrategyNum;
	}

	public void setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
		this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
	}

	public Integer getStrategyNotAvailableNum() {
		return this.strategyNotAvailableNum;
	}

	public void setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
		this.strategyNotAvailableNum = strategyNotAvailableNum;
	}

	public Integer getAddrAvailableNum() {
		return this.addrAvailableNum;
	}

	public void setAddrAvailableNum(Integer addrAvailableNum) {
		this.addrAvailableNum = addrAvailableNum;
	}

	@Override
	public DescribeDnsGtmInstanceStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmInstanceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
