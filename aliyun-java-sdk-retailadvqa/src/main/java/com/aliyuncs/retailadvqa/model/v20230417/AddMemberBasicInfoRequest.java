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

package com.aliyuncs.retailadvqa.model.v20230417;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddMemberBasicInfoRequest extends RpcAcsRequest<AddMemberBasicInfoResponse> {
	   

	@SerializedName("body")
	private Body body;
	public AddMemberBasicInfoRequest() {
		super("retailadvqa", "2023-04-17", "AddMemberBasicInfo", "qucikmember");
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putQueryParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("Birthday")
		private String birthday;

		@SerializedName("Area")
		private String area;

		@SerializedName("Country")
		private String country;

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("City")
		private String city;

		@SerializedName("Sex")
		private String sex;

		@SerializedName("Mobile")
		private String mobile;

		@SerializedName("Avatar")
		private String avatar;

		@SerializedName("GmtCreate")
		private String gmtCreate;

		@SerializedName("MemberNickName")
		private String memberNickName;

		@SerializedName("Province")
		private String province;

		@SerializedName("Channels")
		private List<ChannelsItem> channels;

		@SerializedName("Extra")
		private String extra;

		@SerializedName("PlatFormType")
		private String platFormType;

		@SerializedName("MemberName")
		private String memberName;

		@SerializedName("Email")
		private String email;

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getSex() {
			return this.sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getMemberNickName() {
			return this.memberNickName;
		}

		public void setMemberNickName(String memberNickName) {
			this.memberNickName = memberNickName;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public List<ChannelsItem> getChannels() {
			return this.channels;
		}

		public void setChannels(List<ChannelsItem> channels) {
			this.channels = channels;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getPlatFormType() {
			return this.platFormType;
		}

		public void setPlatFormType(String platFormType) {
			this.platFormType = platFormType;
		}

		public String getMemberName() {
			return this.memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public static class ChannelsItem {

			@SerializedName("AppId")
			private String appId;

			@SerializedName("ChannelOpenId")
			private String channelOpenId;

			@SerializedName("ChannelUnionId")
			private String channelUnionId;

			@SerializedName("ChannelCode")
			private String channelCode;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getChannelOpenId() {
				return this.channelOpenId;
			}

			public void setChannelOpenId(String channelOpenId) {
				this.channelOpenId = channelOpenId;
			}

			public String getChannelUnionId() {
				return this.channelUnionId;
			}

			public void setChannelUnionId(String channelUnionId) {
				this.channelUnionId = channelUnionId;
			}

			public String getChannelCode() {
				return this.channelCode;
			}

			public void setChannelCode(String channelCode) {
				this.channelCode = channelCode;
			}
		}
	}

	@Override
	public Class<AddMemberBasicInfoResponse> getResponseClass() {
		return AddMemberBasicInfoResponse.class;
	}

}
