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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivpd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EraseLogoInVideoRequest extends RpcAcsRequest<EraseLogoInVideoResponse> {
	   

	private List<Boxes> boxess;

	private String jobId;

	private String videoUrl;
	public EraseLogoInVideoRequest() {
		super("ivpd", "2019-06-25", "EraseLogoInVideo", "ivpd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Boxes> getBoxess() {
		return this.boxess;
	}

	public void setBoxess(List<Boxes> boxess) {
		this.boxess = boxess;	
		if (boxess != null) {
			for (int depth1 = 0; depth1 < boxess.size(); depth1++) {
				putBodyParameter("Boxes." + (depth1 + 1) + ".W" , boxess.get(depth1).getW());
				putBodyParameter("Boxes." + (depth1 + 1) + ".H" , boxess.get(depth1).getH());
				putBodyParameter("Boxes." + (depth1 + 1) + ".X" , boxess.get(depth1).getX());
				putBodyParameter("Boxes." + (depth1 + 1) + ".Y" , boxess.get(depth1).getY());
			}
		}	
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		if(videoUrl != null){
			putBodyParameter("VideoUrl", videoUrl);
		}
	}

	public static class Boxes {

		private Float w;

		private Float h;

		private Float x;

		private Float y;

		public Float getW() {
			return this.w;
		}

		public void setW(Float w) {
			this.w = w;
		}

		public Float getH() {
			return this.h;
		}

		public void setH(Float h) {
			this.h = h;
		}

		public Float getX() {
			return this.x;
		}

		public void setX(Float x) {
			this.x = x;
		}

		public Float getY() {
			return this.y;
		}

		public void setY(Float y) {
			this.y = y;
		}
	}

	@Override
	public Class<EraseLogoInVideoResponse> getResponseClass() {
		return EraseLogoInVideoResponse.class;
	}

}
