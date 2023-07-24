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

		@SerializedName("FirstEntryChannel")
		private String firstEntryChannel;

		@SerializedName("Point")
		private Double point;

		@SerializedName("DimensionType")
		private String dimensionType;

		@SerializedName("GrowthPoint")
		private Long growthPoint;

		@SerializedName("DimensionId")
		private String dimensionId;

		@SerializedName("Province")
		private String province;

		@SerializedName("Channels")
		private List<ChannelsItem> channels;

		@SerializedName("Extra")
		private String extra;

		@SerializedName("PlatFromType")
		private String platFromType;

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

		public String getFirstEntryChannel() {
			return this.firstEntryChannel;
		}

		public void setFirstEntryChannel(String firstEntryChannel) {
			this.firstEntryChannel = firstEntryChannel;
		}

		public Double getPoint() {
			return this.point;
		}

		public void setPoint(Double point) {
			this.point = point;
		}

		public String getDimensionType() {
			return this.dimensionType;
		}

		public void setDimensionType(String dimensionType) {
			this.dimensionType = dimensionType;
		}

		public Long getGrowthPoint() {
			return this.growthPoint;
		}

		public void setGrowthPoint(Long growthPoint) {
			this.growthPoint = growthPoint;
		}

		public String getDimensionId() {
			return this.dimensionId;
		}

		public void setDimensionId(String dimensionId) {
			this.dimensionId = dimensionId;
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

		public String getPlatFromType() {
			return this.platFromType;
		}

		public void setPlatFromType(String platFromType) {
			this.platFromType = platFromType;
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

			@SerializedName("UnionId")
			private String unionId;

			@SerializedName("OpenId")
			private String openId;

			@SerializedName("ChannelType")
			private String channelType;

			public String getUnionId() {
				return this.unionId;
			}

			public void setUnionId(String unionId) {
				this.unionId = unionId;
			}

			public String getOpenId() {
				return this.openId;
			}

			public void setOpenId(String openId) {
				this.openId = openId;
			}

			public String getChannelType() {
				return this.channelType;
			}

			public void setChannelType(String channelType) {
				this.channelType = channelType;
			}
		}
	}

	@Override
	public Class<AddMemberBasicInfoResponse> getResponseClass() {
		return AddMemberBasicInfoResponse.class;
	}

}
