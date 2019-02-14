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
import com.aliyuncs.cdn.transform.v20180510.DescribeUserConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserConfigsResponse extends AcsResponse {

	private String requestId;

	private Configs configs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Configs getConfigs() {
		return this.configs;
	}

	public void setConfigs(Configs configs) {
		this.configs = configs;
	}

	public static class Configs {

		private OssLogConfig ossLogConfig;

		private GreenManagerConfig greenManagerConfig;

		private WafConfig wafConfig;

		public OssLogConfig getOssLogConfig() {
			return this.ossLogConfig;
		}

		public void setOssLogConfig(OssLogConfig ossLogConfig) {
			this.ossLogConfig = ossLogConfig;
		}

		public GreenManagerConfig getGreenManagerConfig() {
			return this.greenManagerConfig;
		}

		public void setGreenManagerConfig(GreenManagerConfig greenManagerConfig) {
			this.greenManagerConfig = greenManagerConfig;
		}

		public WafConfig getWafConfig() {
			return this.wafConfig;
		}

		public void setWafConfig(WafConfig wafConfig) {
			this.wafConfig = wafConfig;
		}

		public static class OssLogConfig {

			private String enable;

			private String bucket;

			private String prefix;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getPrefix() {
				return this.prefix;
			}

			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}
		}

		public static class GreenManagerConfig {

			private String quota;

			private String ratio;

			public String getQuota() {
				return this.quota;
			}

			public void setQuota(String quota) {
				this.quota = quota;
			}

			public String getRatio() {
				return this.ratio;
			}

			public void setRatio(String ratio) {
				this.ratio = ratio;
			}
		}

		public static class WafConfig {

			private String enable;

			public String getEnable() {
				return this.enable;
			}

			public void setEnable(String enable) {
				this.enable = enable;
			}
		}
	}

	@Override
	public DescribeUserConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
