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

package com.aliyuncs.domain.model.v20180129;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.LookupTmchNoticeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LookupTmchNoticeResponse extends AcsResponse {

	private String requestId;

	private String label;

	private Long id;

	private String notBefore;

	private String notAfter;

	private List<Claim> claims;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNotBefore() {
		return this.notBefore;
	}

	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}

	public String getNotAfter() {
		return this.notAfter;
	}

	public void setNotAfter(String notAfter) {
		this.notAfter = notAfter;
	}

	public List<Claim> getClaims() {
		return this.claims;
	}

	public void setClaims(List<Claim> claims) {
		this.claims = claims;
	}

	public static class Claim {

		private String goodsAndServices;

		private String markName;

		private List<Contact> contacts;

		private List<ClassDesc> classDescs;

		private List<Holder> holders;

		private JurDesc jurDesc;

		public String getGoodsAndServices() {
			return this.goodsAndServices;
		}

		public void setGoodsAndServices(String goodsAndServices) {
			this.goodsAndServices = goodsAndServices;
		}

		public String getMarkName() {
			return this.markName;
		}

		public void setMarkName(String markName) {
			this.markName = markName;
		}

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public List<ClassDesc> getClassDescs() {
			return this.classDescs;
		}

		public void setClassDescs(List<ClassDesc> classDescs) {
			this.classDescs = classDescs;
		}

		public List<Holder> getHolders() {
			return this.holders;
		}

		public void setHolders(List<Holder> holders) {
			this.holders = holders;
		}

		public JurDesc getJurDesc() {
			return this.jurDesc;
		}

		public void setJurDesc(JurDesc jurDesc) {
			this.jurDesc = jurDesc;
		}

		public static class Contact {

			private String type;

			private String voice;

			private String email;

			private String fax;

			private String org;

			private String name;

			private Addr addr;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVoice() {
				return this.voice;
			}

			public void setVoice(String voice) {
				this.voice = voice;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getFax() {
				return this.fax;
			}

			public void setFax(String fax) {
				this.fax = fax;
			}

			public String getOrg() {
				return this.org;
			}

			public void setOrg(String org) {
				this.org = org;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Addr getAddr() {
				return this.addr;
			}

			public void setAddr(Addr addr) {
				this.addr = addr;
			}

			public static class Addr {

				private String cc;

				private String sp;

				private String pc;

				private String city;

				private List<String> street;

				public String getCc() {
					return this.cc;
				}

				public void setCc(String cc) {
					this.cc = cc;
				}

				public String getSp() {
					return this.sp;
				}

				public void setSp(String sp) {
					this.sp = sp;
				}

				public String getPc() {
					return this.pc;
				}

				public void setPc(String pc) {
					this.pc = pc;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public List<String> getStreet() {
					return this.street;
				}

				public void setStreet(List<String> street) {
					this.street = street;
				}
			}
		}

		public static class ClassDesc {

			private Integer classNum;

			private String desc;

			public Integer getClassNum() {
				return this.classNum;
			}

			public void setClassNum(Integer classNum) {
				this.classNum = classNum;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
		}

		public static class Holder {

			private String entitlement;

			private String org;

			private Addr1 addr1;

			public String getEntitlement() {
				return this.entitlement;
			}

			public void setEntitlement(String entitlement) {
				this.entitlement = entitlement;
			}

			public String getOrg() {
				return this.org;
			}

			public void setOrg(String org) {
				this.org = org;
			}

			public Addr1 getAddr1() {
				return this.addr1;
			}

			public void setAddr1(Addr1 addr1) {
				this.addr1 = addr1;
			}

			public static class Addr1 {

				private String cc;

				private String sp;

				private String pc;

				private String city;

				private List<String> street2;

				public String getCc() {
					return this.cc;
				}

				public void setCc(String cc) {
					this.cc = cc;
				}

				public String getSp() {
					return this.sp;
				}

				public void setSp(String sp) {
					this.sp = sp;
				}

				public String getPc() {
					return this.pc;
				}

				public void setPc(String pc) {
					this.pc = pc;
				}

				public String getCity() {
					return this.city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public List<String> getStreet2() {
					return this.street2;
				}

				public void setStreet2(List<String> street2) {
					this.street2 = street2;
				}
			}
		}

		public static class JurDesc {

			private String jurCC;

			private String desc;

			public String getJurCC() {
				return this.jurCC;
			}

			public void setJurCC(String jurCC) {
				this.jurCC = jurCC;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
		}
	}

	@Override
	public LookupTmchNoticeResponse getInstance(UnmarshallerContext context) {
		return	LookupTmchNoticeResponseUnmarshaller.unmarshall(this, context);
	}
}
