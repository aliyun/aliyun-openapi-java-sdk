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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRecordTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordTemplatesResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long totalPage;

	private List<Template> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String createTime;

		private String templateId;

		private String name;

		private Integer mediaEncode;

		private Integer backgroundColor;

		private Integer fileSplitInterval;

		private String taskProfile;

		private String ossBucket;

		private String ossFilePrefix;

		private String mnsQueue;

		private List<Integer> layoutIds;

		private List<String> formats;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getMediaEncode() {
			return this.mediaEncode;
		}

		public void setMediaEncode(Integer mediaEncode) {
			this.mediaEncode = mediaEncode;
		}

		public Integer getBackgroundColor() {
			return this.backgroundColor;
		}

		public void setBackgroundColor(Integer backgroundColor) {
			this.backgroundColor = backgroundColor;
		}

		public Integer getFileSplitInterval() {
			return this.fileSplitInterval;
		}

		public void setFileSplitInterval(Integer fileSplitInterval) {
			this.fileSplitInterval = fileSplitInterval;
		}

		public String getTaskProfile() {
			return this.taskProfile;
		}

		public void setTaskProfile(String taskProfile) {
			this.taskProfile = taskProfile;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getOssFilePrefix() {
			return this.ossFilePrefix;
		}

		public void setOssFilePrefix(String ossFilePrefix) {
			this.ossFilePrefix = ossFilePrefix;
		}

		public String getMnsQueue() {
			return this.mnsQueue;
		}

		public void setMnsQueue(String mnsQueue) {
			this.mnsQueue = mnsQueue;
		}

		public List<Integer> getLayoutIds() {
			return this.layoutIds;
		}

		public void setLayoutIds(List<Integer> layoutIds) {
			this.layoutIds = layoutIds;
		}

		public List<String> getFormats() {
			return this.formats;
		}

		public void setFormats(List<String> formats) {
			this.formats = formats;
		}
	}

	@Override
	public DescribeRecordTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecordTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
