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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeOssIncrementOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssIncrementOverviewResponse extends AcsResponse {

	private String requestId;

	private Integer imageCount;

	private Integer videoCount;

	private Integer videoFrameCount;

	private Integer pornUnhandleCount;

	private Integer terrorismUnhandleCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getImageCount() {
		return this.imageCount;
	}

	public void setImageCount(Integer imageCount) {
		this.imageCount = imageCount;
	}

	public Integer getVideoCount() {
		return this.videoCount;
	}

	public void setVideoCount(Integer videoCount) {
		this.videoCount = videoCount;
	}

	public Integer getVideoFrameCount() {
		return this.videoFrameCount;
	}

	public void setVideoFrameCount(Integer videoFrameCount) {
		this.videoFrameCount = videoFrameCount;
	}

	public Integer getPornUnhandleCount() {
		return this.pornUnhandleCount;
	}

	public void setPornUnhandleCount(Integer pornUnhandleCount) {
		this.pornUnhandleCount = pornUnhandleCount;
	}

	public Integer getTerrorismUnhandleCount() {
		return this.terrorismUnhandleCount;
	}

	public void setTerrorismUnhandleCount(Integer terrorismUnhandleCount) {
		this.terrorismUnhandleCount = terrorismUnhandleCount;
	}

	@Override
	public DescribeOssIncrementOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssIncrementOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
