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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeGroupMultipleQueueInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeGroupMultipleQueueInfoResponse extends AcsResponse {

	private String requestId;

	private String blackListScanInterval;

	private String mode;

	private String dbConfig;

	private String zkConfig;

	private String recommendedConfig;

	private String scanInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBlackListScanInterval() {
		return this.blackListScanInterval;
	}

	public void setBlackListScanInterval(String blackListScanInterval) {
		this.blackListScanInterval = blackListScanInterval;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getDbConfig() {
		return this.dbConfig;
	}

	public void setDbConfig(String dbConfig) {
		this.dbConfig = dbConfig;
	}

	public String getZkConfig() {
		return this.zkConfig;
	}

	public void setZkConfig(String zkConfig) {
		this.zkConfig = zkConfig;
	}

	public String getRecommendedConfig() {
		return this.recommendedConfig;
	}

	public void setRecommendedConfig(String recommendedConfig) {
		this.recommendedConfig = recommendedConfig;
	}

	public String getScanInterval() {
		return this.scanInterval;
	}

	public void setScanInterval(String scanInterval) {
		this.scanInterval = scanInterval;
	}

	@Override
	public OpsDescribeGroupMultipleQueueInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeGroupMultipleQueueInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
