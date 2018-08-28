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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.DescribeImageGatewayConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageGatewayConfigResponse extends AcsResponse {

	private String requestId;

	private Imagegw imagegw;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Imagegw getImagegw() {
		return this.imagegw;
	}

	public void setImagegw(Imagegw imagegw) {
		this.imagegw = imagegw;
	}

	public static class Imagegw {

		private String defaultImageLocation;

		private Long pullUpdateTimeout;

		private String mongoDBURI;

		private String imageExpirationTimeout;

		private String updateDateTime;

		private List<LocationInfo> locations;

		public String getDefaultImageLocation() {
			return this.defaultImageLocation;
		}

		public void setDefaultImageLocation(String defaultImageLocation) {
			this.defaultImageLocation = defaultImageLocation;
		}

		public Long getPullUpdateTimeout() {
			return this.pullUpdateTimeout;
		}

		public void setPullUpdateTimeout(Long pullUpdateTimeout) {
			this.pullUpdateTimeout = pullUpdateTimeout;
		}

		public String getMongoDBURI() {
			return this.mongoDBURI;
		}

		public void setMongoDBURI(String mongoDBURI) {
			this.mongoDBURI = mongoDBURI;
		}

		public String getImageExpirationTimeout() {
			return this.imageExpirationTimeout;
		}

		public void setImageExpirationTimeout(String imageExpirationTimeout) {
			this.imageExpirationTimeout = imageExpirationTimeout;
		}

		public String getUpdateDateTime() {
			return this.updateDateTime;
		}

		public void setUpdateDateTime(String updateDateTime) {
			this.updateDateTime = updateDateTime;
		}

		public List<LocationInfo> getLocations() {
			return this.locations;
		}

		public void setLocations(List<LocationInfo> locations) {
			this.locations = locations;
		}

		public static class LocationInfo {

			private String location;

			private String remoteType;

			private String authentication;

			private String uRL;

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getRemoteType() {
				return this.remoteType;
			}

			public void setRemoteType(String remoteType) {
				this.remoteType = remoteType;
			}

			public String getAuthentication() {
				return this.authentication;
			}

			public void setAuthentication(String authentication) {
				this.authentication = authentication;
			}

			public String getURL() {
				return this.uRL;
			}

			public void setURL(String uRL) {
				this.uRL = uRL;
			}
		}
	}

	@Override
	public DescribeImageGatewayConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageGatewayConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
