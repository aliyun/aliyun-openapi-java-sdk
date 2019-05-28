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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeProxyFunctionSupportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProxyFunctionSupportResponse extends AcsResponse {

	private String requestId;

	private Boolean isProxySwitchEnable;

	private Boolean isRwsplitEnable;

	private Boolean isRwsplitSupportReplicationLag;

	private Boolean isRwsplitSupportWeight;

	private Boolean isTransparentSwitchEnable;

	private Boolean isShortConnectionOptimizeEnable;

	private Boolean isAntiBruteFroceEnable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsProxySwitchEnable() {
		return this.isProxySwitchEnable;
	}

	public void setIsProxySwitchEnable(Boolean isProxySwitchEnable) {
		this.isProxySwitchEnable = isProxySwitchEnable;
	}

	public Boolean getIsRwsplitEnable() {
		return this.isRwsplitEnable;
	}

	public void setIsRwsplitEnable(Boolean isRwsplitEnable) {
		this.isRwsplitEnable = isRwsplitEnable;
	}

	public Boolean getIsRwsplitSupportReplicationLag() {
		return this.isRwsplitSupportReplicationLag;
	}

	public void setIsRwsplitSupportReplicationLag(Boolean isRwsplitSupportReplicationLag) {
		this.isRwsplitSupportReplicationLag = isRwsplitSupportReplicationLag;
	}

	public Boolean getIsRwsplitSupportWeight() {
		return this.isRwsplitSupportWeight;
	}

	public void setIsRwsplitSupportWeight(Boolean isRwsplitSupportWeight) {
		this.isRwsplitSupportWeight = isRwsplitSupportWeight;
	}

	public Boolean getIsTransparentSwitchEnable() {
		return this.isTransparentSwitchEnable;
	}

	public void setIsTransparentSwitchEnable(Boolean isTransparentSwitchEnable) {
		this.isTransparentSwitchEnable = isTransparentSwitchEnable;
	}

	public Boolean getIsShortConnectionOptimizeEnable() {
		return this.isShortConnectionOptimizeEnable;
	}

	public void setIsShortConnectionOptimizeEnable(Boolean isShortConnectionOptimizeEnable) {
		this.isShortConnectionOptimizeEnable = isShortConnectionOptimizeEnable;
	}

	public Boolean getIsAntiBruteFroceEnable() {
		return this.isAntiBruteFroceEnable;
	}

	public void setIsAntiBruteFroceEnable(Boolean isAntiBruteFroceEnable) {
		this.isAntiBruteFroceEnable = isAntiBruteFroceEnable;
	}

	@Override
	public DescribeProxyFunctionSupportResponse getInstance(UnmarshallerContext context) {
		return	DescribeProxyFunctionSupportResponseUnmarshaller.unmarshall(this, context);
	}
}
