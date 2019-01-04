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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeProxyFunctionSupportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProxyFunctionSupportResponse extends AcsResponse {

	private String requestId;

	private Integer isProxyEnable;

	private Integer isRwsplitEnable;

	private Integer isRwsplitSupportReplicationLag;

	private Integer isRwsplitSupportWeight;

	private Integer isTransparentSwitchEnable;

	private Integer isShortConnectionOptimizeEnable;

	private Integer isAntiBruteFroceEnable;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIsProxyEnable() {
		return this.isProxyEnable;
	}

	public void setIsProxyEnable(Integer isProxyEnable) {
		this.isProxyEnable = isProxyEnable;
	}

	public Integer getIsRwsplitEnable() {
		return this.isRwsplitEnable;
	}

	public void setIsRwsplitEnable(Integer isRwsplitEnable) {
		this.isRwsplitEnable = isRwsplitEnable;
	}

	public Integer getIsRwsplitSupportReplicationLag() {
		return this.isRwsplitSupportReplicationLag;
	}

	public void setIsRwsplitSupportReplicationLag(Integer isRwsplitSupportReplicationLag) {
		this.isRwsplitSupportReplicationLag = isRwsplitSupportReplicationLag;
	}

	public Integer getIsRwsplitSupportWeight() {
		return this.isRwsplitSupportWeight;
	}

	public void setIsRwsplitSupportWeight(Integer isRwsplitSupportWeight) {
		this.isRwsplitSupportWeight = isRwsplitSupportWeight;
	}

	public Integer getIsTransparentSwitchEnable() {
		return this.isTransparentSwitchEnable;
	}

	public void setIsTransparentSwitchEnable(Integer isTransparentSwitchEnable) {
		this.isTransparentSwitchEnable = isTransparentSwitchEnable;
	}

	public Integer getIsShortConnectionOptimizeEnable() {
		return this.isShortConnectionOptimizeEnable;
	}

	public void setIsShortConnectionOptimizeEnable(Integer isShortConnectionOptimizeEnable) {
		this.isShortConnectionOptimizeEnable = isShortConnectionOptimizeEnable;
	}

	public Integer getIsAntiBruteFroceEnable() {
		return this.isAntiBruteFroceEnable;
	}

	public void setIsAntiBruteFroceEnable(Integer isAntiBruteFroceEnable) {
		this.isAntiBruteFroceEnable = isAntiBruteFroceEnable;
	}

	@Override
	public DescribeProxyFunctionSupportResponse getInstance(UnmarshallerContext context) {
		return	DescribeProxyFunctionSupportResponseUnmarshaller.unmarshall(this, context);
	}
}
