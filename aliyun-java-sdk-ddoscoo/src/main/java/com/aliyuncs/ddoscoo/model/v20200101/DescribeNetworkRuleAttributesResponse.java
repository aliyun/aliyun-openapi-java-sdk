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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeNetworkRuleAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkRuleAttributesResponse extends AcsResponse {

	private String requestId;

	private List<NetworkRuleAttribute> networkRuleAttributes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NetworkRuleAttribute> getNetworkRuleAttributes() {
		return this.networkRuleAttributes;
	}

	public void setNetworkRuleAttributes(List<NetworkRuleAttribute> networkRuleAttributes) {
		this.networkRuleAttributes = networkRuleAttributes;
	}

	public static class NetworkRuleAttribute {

		private String instanceId;

		private String protocol;

		private Integer frontendPort;

		private Config config;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public static class Config {

			private Integer persistenceTimeout;

			private String synproxy;

			private String nodataConn;

			private Sla sla;

			private Slimit slimit;

			private PayloadLen payloadLen;

			private Cc cc;

			public Integer getPersistenceTimeout() {
				return this.persistenceTimeout;
			}

			public void setPersistenceTimeout(Integer persistenceTimeout) {
				this.persistenceTimeout = persistenceTimeout;
			}

			public String getSynproxy() {
				return this.synproxy;
			}

			public void setSynproxy(String synproxy) {
				this.synproxy = synproxy;
			}

			public String getNodataConn() {
				return this.nodataConn;
			}

			public void setNodataConn(String nodataConn) {
				this.nodataConn = nodataConn;
			}

			public Sla getSla() {
				return this.sla;
			}

			public void setSla(Sla sla) {
				this.sla = sla;
			}

			public Slimit getSlimit() {
				return this.slimit;
			}

			public void setSlimit(Slimit slimit) {
				this.slimit = slimit;
			}

			public PayloadLen getPayloadLen() {
				return this.payloadLen;
			}

			public void setPayloadLen(PayloadLen payloadLen) {
				this.payloadLen = payloadLen;
			}

			public Cc getCc() {
				return this.cc;
			}

			public void setCc(Cc cc) {
				this.cc = cc;
			}

			public static class Sla {

				private Integer cps;

				private Integer maxconn;

				private Integer cpsEnable;

				private Integer maxconnEnable;

				public Integer getCps() {
					return this.cps;
				}

				public void setCps(Integer cps) {
					this.cps = cps;
				}

				public Integer getMaxconn() {
					return this.maxconn;
				}

				public void setMaxconn(Integer maxconn) {
					this.maxconn = maxconn;
				}

				public Integer getCpsEnable() {
					return this.cpsEnable;
				}

				public void setCpsEnable(Integer cpsEnable) {
					this.cpsEnable = cpsEnable;
				}

				public Integer getMaxconnEnable() {
					return this.maxconnEnable;
				}

				public void setMaxconnEnable(Integer maxconnEnable) {
					this.maxconnEnable = maxconnEnable;
				}
			}

			public static class Slimit {

				private Integer cps;

				private Integer maxconn;

				private Integer cpsEnable;

				private Integer cpsMode;

				private Integer maxconnEnable;

				private Long bps;

				private Long pps;

				public Integer getCps() {
					return this.cps;
				}

				public void setCps(Integer cps) {
					this.cps = cps;
				}

				public Integer getMaxconn() {
					return this.maxconn;
				}

				public void setMaxconn(Integer maxconn) {
					this.maxconn = maxconn;
				}

				public Integer getCpsEnable() {
					return this.cpsEnable;
				}

				public void setCpsEnable(Integer cpsEnable) {
					this.cpsEnable = cpsEnable;
				}

				public Integer getCpsMode() {
					return this.cpsMode;
				}

				public void setCpsMode(Integer cpsMode) {
					this.cpsMode = cpsMode;
				}

				public Integer getMaxconnEnable() {
					return this.maxconnEnable;
				}

				public void setMaxconnEnable(Integer maxconnEnable) {
					this.maxconnEnable = maxconnEnable;
				}

				public Long getBps() {
					return this.bps;
				}

				public void setBps(Long bps) {
					this.bps = bps;
				}

				public Long getPps() {
					return this.pps;
				}

				public void setPps(Long pps) {
					this.pps = pps;
				}
			}

			public static class PayloadLen {

				private Integer min;

				private Integer max;

				public Integer getMin() {
					return this.min;
				}

				public void setMin(Integer min) {
					this.min = min;
				}

				public Integer getMax() {
					return this.max;
				}

				public void setMax(Integer max) {
					this.max = max;
				}
			}

			public static class Cc {

				private List<SblackItem> sblack;

				public List<SblackItem> getSblack() {
					return this.sblack;
				}

				public void setSblack(List<SblackItem> sblack) {
					this.sblack = sblack;
				}

				public static class SblackItem {

					private Integer during;

					private Integer expires;

					private Integer cnt;

					private Integer type;

					public Integer getDuring() {
						return this.during;
					}

					public void setDuring(Integer during) {
						this.during = during;
					}

					public Integer getExpires() {
						return this.expires;
					}

					public void setExpires(Integer expires) {
						this.expires = expires;
					}

					public Integer getCnt() {
						return this.cnt;
					}

					public void setCnt(Integer cnt) {
						this.cnt = cnt;
					}

					public Integer getType() {
						return this.type;
					}

					public void setType(Integer type) {
						this.type = type;
					}
				}
			}
		}
	}

	@Override
	public DescribeNetworkRuleAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkRuleAttributesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
