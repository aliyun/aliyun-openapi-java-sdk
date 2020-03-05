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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateClusterVolumesRequest extends RpcAcsRequest<UpdateClusterVolumesResponse> {
	   

	private List<AdditionalVolumes> additionalVolumess;

	private String clusterId;
	public UpdateClusterVolumesRequest() {
		super("EHPC", "2018-04-12", "UpdateClusterVolumes", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AdditionalVolumes> getAdditionalVolumess() {
		return this.additionalVolumess;
	}

	public void setAdditionalVolumess(List<AdditionalVolumes> additionalVolumess) {
		this.additionalVolumess = additionalVolumess;	
		if (additionalVolumess != null) {
			for (int depth1 = 0; depth1 < additionalVolumess.size(); depth1++) {
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeType" , additionalVolumess.get(depth1).getVolumeType());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeProtocol" , additionalVolumess.get(depth1).getVolumeProtocol());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".LocalDirectory" , additionalVolumess.get(depth1).getLocalDirectory());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".RemoteDirectory" , additionalVolumess.get(depth1).getRemoteDirectory());
				if (additionalVolumess.get(depth1).getRoless() != null) {
					for (int depth2 = 0; depth2 < additionalVolumess.get(depth1).getRoless().size(); depth2++) {
						putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".Roles." + (depth2 + 1) + ".Name" , additionalVolumess.get(depth1).getRoless().get(depth2).getName());
					}
				}
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeId" , additionalVolumess.get(depth1).getVolumeId());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".VolumeMountpoint" , additionalVolumess.get(depth1).getVolumeMountpoint());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".Location" , additionalVolumess.get(depth1).getLocation());
				putQueryParameter("AdditionalVolumes." + (depth1 + 1) + ".JobQueue" , additionalVolumess.get(depth1).getJobQueue());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public static class AdditionalVolumes {

		private String volumeType;

		private String volumeProtocol;

		private String localDirectory;

		private String remoteDirectory;

		private List<Roles> roless;

		private String volumeId;

		private String volumeMountpoint;

		private String location;

		private String jobQueue;

		public String getVolumeType() {
			return this.volumeType;
		}

		public void setVolumeType(String volumeType) {
			this.volumeType = volumeType;
		}

		public String getVolumeProtocol() {
			return this.volumeProtocol;
		}

		public void setVolumeProtocol(String volumeProtocol) {
			this.volumeProtocol = volumeProtocol;
		}

		public String getLocalDirectory() {
			return this.localDirectory;
		}

		public void setLocalDirectory(String localDirectory) {
			this.localDirectory = localDirectory;
		}

		public String getRemoteDirectory() {
			return this.remoteDirectory;
		}

		public void setRemoteDirectory(String remoteDirectory) {
			this.remoteDirectory = remoteDirectory;
		}

		public List<Roles> getRoless() {
			return this.roless;
		}

		public void setRoless(List<Roles> roless) {
			this.roless = roless;
		}

		public String getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(String volumeId) {
			this.volumeId = volumeId;
		}

		public String getVolumeMountpoint() {
			return this.volumeMountpoint;
		}

		public void setVolumeMountpoint(String volumeMountpoint) {
			this.volumeMountpoint = volumeMountpoint;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getJobQueue() {
			return this.jobQueue;
		}

		public void setJobQueue(String jobQueue) {
			this.jobQueue = jobQueue;
		}

		public static class Roles {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public Class<UpdateClusterVolumesResponse> getResponseClass() {
		return UpdateClusterVolumesResponse.class;
	}

}
