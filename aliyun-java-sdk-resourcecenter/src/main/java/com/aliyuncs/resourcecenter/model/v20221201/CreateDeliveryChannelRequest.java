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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDeliveryChannelRequest extends RpcAcsRequest<CreateDeliveryChannelResponse> {
	   

	private String deliveryChannelDescription;

	private ResourceChangeDelivery resourceChangeDelivery;

	private String deliveryChannelName;

	private DeliveryChannelFilter deliveryChannelFilter;

	private ResourceSnapshotDelivery resourceSnapshotDelivery;
	public CreateDeliveryChannelRequest() {
		super("ResourceCenter", "2022-12-01", "CreateDeliveryChannel");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getDeliveryChannelDescription() {
		return this.deliveryChannelDescription;
	}

	public void setDeliveryChannelDescription(String deliveryChannelDescription) {
		this.deliveryChannelDescription = deliveryChannelDescription;
		if(deliveryChannelDescription != null){
			putQueryParameter("DeliveryChannelDescription", deliveryChannelDescription);
		}
	}

	public ResourceChangeDelivery getResourceChangeDelivery() {
		return this.resourceChangeDelivery;
	}

	public void setResourceChangeDelivery(ResourceChangeDelivery resourceChangeDelivery) {
		this.resourceChangeDelivery = resourceChangeDelivery;	
		if (resourceChangeDelivery != null) {
			
				putQueryParameter("ResourceChangeDelivery.TargetType" , resourceChangeDelivery.getTargetType());
				if (resourceChangeDelivery.getSlsProperties() != null) {
					
						putQueryParameter("ResourceChangeDelivery.SlsProperties.OversizedDataOssTargetArn" , resourceChangeDelivery.getSlsProperties().getOversizedDataOssTargetArn());
				}
				putQueryParameter("ResourceChangeDelivery.TargetArn" , resourceChangeDelivery.getTargetArn());
		}	
	}

	public String getDeliveryChannelName() {
		return this.deliveryChannelName;
	}

	public void setDeliveryChannelName(String deliveryChannelName) {
		this.deliveryChannelName = deliveryChannelName;
		if(deliveryChannelName != null){
			putQueryParameter("DeliveryChannelName", deliveryChannelName);
		}
	}

	public DeliveryChannelFilter getDeliveryChannelFilter() {
		return this.deliveryChannelFilter;
	}

	public void setDeliveryChannelFilter(DeliveryChannelFilter deliveryChannelFilter) {
		this.deliveryChannelFilter = deliveryChannelFilter;	
		if (deliveryChannelFilter != null) {
			
				if (deliveryChannelFilter.getResourceTypes() != null) {
					for (int depth1 = 0; depth1 < deliveryChannelFilter.getResourceTypes().size(); depth1++) {
						putQueryParameter("DeliveryChannelFilter.ResourceTypes." + (depth1 + 1) , deliveryChannelFilter.getResourceTypes().get(depth1));
					}
				}
		}	
	}

	public ResourceSnapshotDelivery getResourceSnapshotDelivery() {
		return this.resourceSnapshotDelivery;
	}

	public void setResourceSnapshotDelivery(ResourceSnapshotDelivery resourceSnapshotDelivery) {
		this.resourceSnapshotDelivery = resourceSnapshotDelivery;	
		if (resourceSnapshotDelivery != null) {
			
				putQueryParameter("ResourceSnapshotDelivery.TargetType" , resourceSnapshotDelivery.getTargetType());
				putQueryParameter("ResourceSnapshotDelivery.DeliveryTime" , resourceSnapshotDelivery.getDeliveryTime());
				putQueryParameter("ResourceSnapshotDelivery.CustomExpression" , resourceSnapshotDelivery.getCustomExpression());
				if (resourceSnapshotDelivery.getSlsProperties() != null) {
					
						putQueryParameter("ResourceSnapshotDelivery.SlsProperties.OversizedDataOssTargetArn" , resourceSnapshotDelivery.getSlsProperties().getOversizedDataOssTargetArn());
				}
				putQueryParameter("ResourceSnapshotDelivery.TargetArn" , resourceSnapshotDelivery.getTargetArn());
		}	
	}

	public static class ResourceChangeDelivery {

		private String targetType;

		private SlsProperties slsProperties;

		private String targetArn;

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public SlsProperties getSlsProperties() {
			return this.slsProperties;
		}

		public void setSlsProperties(SlsProperties slsProperties) {
			this.slsProperties = slsProperties;
		}

		public String getTargetArn() {
			return this.targetArn;
		}

		public void setTargetArn(String targetArn) {
			this.targetArn = targetArn;
		}

		public static class SlsProperties {

			private String oversizedDataOssTargetArn;

			public String getOversizedDataOssTargetArn() {
				return this.oversizedDataOssTargetArn;
			}

			public void setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
				this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
			}
		}
	}

	public static class DeliveryChannelFilter {

		private List<String> resourceTypes;

		public List<String> getResourceTypes() {
			return this.resourceTypes;
		}

		public void setResourceTypes(List<String> resourceTypes) {
			this.resourceTypes = resourceTypes;
		}
	}

	public static class ResourceSnapshotDelivery {

		private String targetType;

		private String deliveryTime;

		private String customExpression;

		private SlsProperties slsProperties;

		private String targetArn;

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getDeliveryTime() {
			return this.deliveryTime;
		}

		public void setDeliveryTime(String deliveryTime) {
			this.deliveryTime = deliveryTime;
		}

		public String getCustomExpression() {
			return this.customExpression;
		}

		public void setCustomExpression(String customExpression) {
			this.customExpression = customExpression;
		}

		public SlsProperties getSlsProperties() {
			return this.slsProperties;
		}

		public void setSlsProperties(SlsProperties slsProperties) {
			this.slsProperties = slsProperties;
		}

		public String getTargetArn() {
			return this.targetArn;
		}

		public void setTargetArn(String targetArn) {
			this.targetArn = targetArn;
		}

		public static class SlsProperties {

			private String oversizedDataOssTargetArn;

			public String getOversizedDataOssTargetArn() {
				return this.oversizedDataOssTargetArn;
			}

			public void setOversizedDataOssTargetArn(String oversizedDataOssTargetArn) {
				this.oversizedDataOssTargetArn = oversizedDataOssTargetArn;
			}
		}
	}

	@Override
	public Class<CreateDeliveryChannelResponse> getResponseClass() {
		return CreateDeliveryChannelResponse.class;
	}

}
