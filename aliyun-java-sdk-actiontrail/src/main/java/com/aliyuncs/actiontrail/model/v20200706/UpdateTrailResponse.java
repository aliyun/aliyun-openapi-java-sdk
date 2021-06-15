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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.UpdateTrailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateTrailResponse extends AcsResponse {

	private String slsProjectArn;

	private String eventRW;

	private String requestId;

	private String homeRegion;

	private String ossKeyPrefix;

	private String ossBucketName;

	private String slsWriteRoleArn;

	private String ossWriteRoleArn;

	private String trailRegion;

	private String name;

	public String getSlsProjectArn() {
		return this.slsProjectArn;
	}

	public void setSlsProjectArn(String slsProjectArn) {
		this.slsProjectArn = slsProjectArn;
	}

	public String getEventRW() {
		return this.eventRW;
	}

	public void setEventRW(String eventRW) {
		this.eventRW = eventRW;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHomeRegion() {
		return this.homeRegion;
	}

	public void setHomeRegion(String homeRegion) {
		this.homeRegion = homeRegion;
	}

	public String getOssKeyPrefix() {
		return this.ossKeyPrefix;
	}

	public void setOssKeyPrefix(String ossKeyPrefix) {
		this.ossKeyPrefix = ossKeyPrefix;
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
	}

	public String getSlsWriteRoleArn() {
		return this.slsWriteRoleArn;
	}

	public void setSlsWriteRoleArn(String slsWriteRoleArn) {
		this.slsWriteRoleArn = slsWriteRoleArn;
	}

	public String getOssWriteRoleArn() {
		return this.ossWriteRoleArn;
	}

	public void setOssWriteRoleArn(String ossWriteRoleArn) {
		this.ossWriteRoleArn = ossWriteRoleArn;
	}

	public String getTrailRegion() {
		return this.trailRegion;
	}

	public void setTrailRegion(String trailRegion) {
		this.trailRegion = trailRegion;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public UpdateTrailResponse getInstance(UnmarshallerContext context) {
		return	UpdateTrailResponseUnmarshaller.unmarshall(this, context);
	}
}
