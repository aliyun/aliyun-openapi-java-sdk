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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.DescribeKnowledgeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKnowledgeResponse extends AcsResponse {

	private String requestId;

	private String endDate;

	private String createUserName;

	private String knowledgeTitle;

	private Integer version;

	private Long knowledgeId;

	private String modifyUserName;

	private String modifyTime;

	private String createTime;

	private Integer knowledgeType;

	private Long categoryId;

	private String startDate;

	private Integer knowledgeStatus;

	private List<Outline> outlines;

	private List<SimQuestion> simQuestions;

	private List<Solution> solutions;

	private List<String> keyWords;

	private List<String> coreWords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getKnowledgeTitle() {
		return this.knowledgeTitle;
	}

	public void setKnowledgeTitle(String knowledgeTitle) {
		this.knowledgeTitle = knowledgeTitle;
	}

    public Integer getBizVersion() {
        return this.version;
    }

    public void setBizVersion(Integer version) {
        this.version = version;
    }

    /**
     * @deprecated use getBizVersion instead of this.
     */
    @Deprecated
	public Integer getVersion() {
		return this.version;
	}

    /**
     * @deprecated use setBizVersion instead of this.
     */
    @Deprecated
	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getModifyUserName() {
		return this.modifyUserName;
	}

	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getKnowledgeType() {
		return this.knowledgeType;
	}

	public void setKnowledgeType(Integer knowledgeType) {
		this.knowledgeType = knowledgeType;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Integer getKnowledgeStatus() {
		return this.knowledgeStatus;
	}

	public void setKnowledgeStatus(Integer knowledgeStatus) {
		this.knowledgeStatus = knowledgeStatus;
	}

	public List<Outline> getOutlines() {
		return this.outlines;
	}

	public void setOutlines(List<Outline> outlines) {
		this.outlines = outlines;
	}

	public List<SimQuestion> getSimQuestions() {
		return this.simQuestions;
	}

	public void setSimQuestions(List<SimQuestion> simQuestions) {
		this.simQuestions = simQuestions;
	}

	public List<Solution> getSolutions() {
		return this.solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public List<String> getCoreWords() {
		return this.coreWords;
	}

	public void setCoreWords(List<String> coreWords) {
		this.coreWords = coreWords;
	}

	public static class Outline {

		private Long knowledgeId;

		private String title;

		private Long outlineId;

		public Long getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(Long knowledgeId) {
			this.knowledgeId = knowledgeId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Long getOutlineId() {
			return this.outlineId;
		}

		public void setOutlineId(Long outlineId) {
			this.outlineId = outlineId;
		}
	}

	public static class SimQuestion {

		private String modifyTime;

		private String createTime;

		private Long simQuestionId;

		private String title;

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSimQuestionId() {
			return this.simQuestionId;
		}

		public void setSimQuestionId(Long simQuestionId) {
			this.simQuestionId = simQuestionId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	public static class Solution {

		private String summary;

		private String modifyTime;

		private String createTime;

		private Long solutionId;

		private String content;

		private String plainText;

		private List<String> perspectiveIds;

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getSolutionId() {
			return this.solutionId;
		}

		public void setSolutionId(Long solutionId) {
			this.solutionId = solutionId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getPlainText() {
			return this.plainText;
		}

		public void setPlainText(String plainText) {
			this.plainText = plainText;
		}

		public List<String> getPerspectiveIds() {
			return this.perspectiveIds;
		}

		public void setPerspectiveIds(List<String> perspectiveIds) {
			this.perspectiveIds = perspectiveIds;
		}
	}

	@Override
	public DescribeKnowledgeResponse getInstance(UnmarshallerContext context) {
		return	DescribeKnowledgeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
