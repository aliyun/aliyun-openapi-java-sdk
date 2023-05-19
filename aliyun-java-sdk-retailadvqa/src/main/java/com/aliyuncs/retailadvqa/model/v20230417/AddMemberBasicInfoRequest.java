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
		super("retailadvqa", "2023-04-17", "AddMemberBasicInfo");
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

		@SerializedName("CreateTime")
		private String createTime;

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("Gender")
		private String gender;

		@SerializedName("City")
		private String city;

		@SerializedName("Mobile")
		private String mobile;

		@SerializedName("Point")
		private String point;

		@SerializedName("DimensionType")
		private String dimensionType;

		@SerializedName("GrowthPoint")
		private String growthPoint;

		@SerializedName("DimensionId")
		private String dimensionId;

		@SerializedName("Province")
		private String province;

		@SerializedName("Channels")
		private List<ChannelsItem> channels;

		@SerializedName("Extra")
		private String extra;

		@SerializedName("Name")
		private String name;

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getPoint() {
			return this.point;
		}

		public void setPoint(String point) {
			this.point = point;
		}

		public String getDimensionType() {
			return this.dimensionType;
		}

		public void setDimensionType(String dimensionType) {
			this.dimensionType = dimensionType;
		}

		public String getGrowthPoint() {
			return this.growthPoint;
		}

		public void setGrowthPoint(String growthPoint) {
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

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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
