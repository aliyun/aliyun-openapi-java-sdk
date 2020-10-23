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

package com.aliyuncs.idsp.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.idsp.transform.v20200710.SearchDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchDataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<YqMessageViewModel> list;

		private PageModel pageModel;

		public List<YqMessageViewModel> getList() {
			return this.list;
		}

		public void setList(List<YqMessageViewModel> list) {
			this.list = list;
		}

		public PageModel getPageModel() {
			return this.pageModel;
		}

		public void setPageModel(PageModel pageModel) {
			this.pageModel = pageModel;
		}

		public static class YqMessageViewModel {

			private String videoUrl;

			private String ossUrl;

			private String videoImageUrl;

			private Long viewsCount;

			private String weChartTags;

			private String weChartKeywords;

			private Boolean advertisement;

			private String authorAvatarUrl;

			private Long authorFollowersCount;

			private Long authorFriendsCount;

			private String authorId;

			private String authorName;

			private String authorProfileUrl;

			private String authorStatusesCount;

			private String authorVerifyType;

			private Long contentEmotionType;

			private String contentImageUrlList;

			private Long creationTime;

			private String docAncestorId;

			private Long docAnswersCount;

			private Long docCommentsCount;

			private String docContent;

			private String docContentBrief;

			private String docContentSign;

			private Long docCreateTime;

			private Long docFocusArticleCount;

			private String docId;

			private Long docLikesCount;

			private String docMessageType;

			private String docParentId;

			private Long docReadsCount;

			private Long docRepostCount;

			private String docSelfContentSign;

			private String docSummary;

			private String docTitle;

			private String docTitleBrief;

			private String docUrl;

			private String emotionScore;

			private String entityAlias;

			private String entityRelevancyScore;

			private Boolean eroticism;

			private String eroticismScore;

			private Boolean gambling;

			private String hitKeywords;

			private Long imageCount;

			private Long mediaInfluenceLevel;

			private String mediaInfluenceScore;

			private String mediaName;

			private String mediaPropagationScore;

			private String mediaGroupName;

			private String mediaResCity;

			private String mediaResCountry;

			private String mediaResProvince;

			private String mediaType;

			private Long publishTime;

			private Long similarDocs;

			private Boolean spam;

			private String wbCommentId;

			private String wbMid;

			private Boolean isPoliticalRisk;

			private String contentVideoUrl;

			private String relevanceScore;

			private String ossVideoUrl;

			private String docContentType;

			private String ossImageUrl;

			public String getVideoUrl() {
				return this.videoUrl;
			}

			public void setVideoUrl(String videoUrl) {
				this.videoUrl = videoUrl;
			}

			public String getOssUrl() {
				return this.ossUrl;
			}

			public void setOssUrl(String ossUrl) {
				this.ossUrl = ossUrl;
			}

			public String getVideoImageUrl() {
				return this.videoImageUrl;
			}

			public void setVideoImageUrl(String videoImageUrl) {
				this.videoImageUrl = videoImageUrl;
			}

			public Long getViewsCount() {
				return this.viewsCount;
			}

			public void setViewsCount(Long viewsCount) {
				this.viewsCount = viewsCount;
			}

			public String getWeChartTags() {
				return this.weChartTags;
			}

			public void setWeChartTags(String weChartTags) {
				this.weChartTags = weChartTags;
			}

			public String getWeChartKeywords() {
				return this.weChartKeywords;
			}

			public void setWeChartKeywords(String weChartKeywords) {
				this.weChartKeywords = weChartKeywords;
			}

			public Boolean getAdvertisement() {
				return this.advertisement;
			}

			public void setAdvertisement(Boolean advertisement) {
				this.advertisement = advertisement;
			}

			public String getAuthorAvatarUrl() {
				return this.authorAvatarUrl;
			}

			public void setAuthorAvatarUrl(String authorAvatarUrl) {
				this.authorAvatarUrl = authorAvatarUrl;
			}

			public Long getAuthorFollowersCount() {
				return this.authorFollowersCount;
			}

			public void setAuthorFollowersCount(Long authorFollowersCount) {
				this.authorFollowersCount = authorFollowersCount;
			}

			public Long getAuthorFriendsCount() {
				return this.authorFriendsCount;
			}

			public void setAuthorFriendsCount(Long authorFriendsCount) {
				this.authorFriendsCount = authorFriendsCount;
			}

			public String getAuthorId() {
				return this.authorId;
			}

			public void setAuthorId(String authorId) {
				this.authorId = authorId;
			}

			public String getAuthorName() {
				return this.authorName;
			}

			public void setAuthorName(String authorName) {
				this.authorName = authorName;
			}

			public String getAuthorProfileUrl() {
				return this.authorProfileUrl;
			}

			public void setAuthorProfileUrl(String authorProfileUrl) {
				this.authorProfileUrl = authorProfileUrl;
			}

			public String getAuthorStatusesCount() {
				return this.authorStatusesCount;
			}

			public void setAuthorStatusesCount(String authorStatusesCount) {
				this.authorStatusesCount = authorStatusesCount;
			}

			public String getAuthorVerifyType() {
				return this.authorVerifyType;
			}

			public void setAuthorVerifyType(String authorVerifyType) {
				this.authorVerifyType = authorVerifyType;
			}

			public Long getContentEmotionType() {
				return this.contentEmotionType;
			}

			public void setContentEmotionType(Long contentEmotionType) {
				this.contentEmotionType = contentEmotionType;
			}

			public String getContentImageUrlList() {
				return this.contentImageUrlList;
			}

			public void setContentImageUrlList(String contentImageUrlList) {
				this.contentImageUrlList = contentImageUrlList;
			}

			public Long getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(Long creationTime) {
				this.creationTime = creationTime;
			}

			public String getDocAncestorId() {
				return this.docAncestorId;
			}

			public void setDocAncestorId(String docAncestorId) {
				this.docAncestorId = docAncestorId;
			}

			public Long getDocAnswersCount() {
				return this.docAnswersCount;
			}

			public void setDocAnswersCount(Long docAnswersCount) {
				this.docAnswersCount = docAnswersCount;
			}

			public Long getDocCommentsCount() {
				return this.docCommentsCount;
			}

			public void setDocCommentsCount(Long docCommentsCount) {
				this.docCommentsCount = docCommentsCount;
			}

			public String getDocContent() {
				return this.docContent;
			}

			public void setDocContent(String docContent) {
				this.docContent = docContent;
			}

			public String getDocContentBrief() {
				return this.docContentBrief;
			}

			public void setDocContentBrief(String docContentBrief) {
				this.docContentBrief = docContentBrief;
			}

			public String getDocContentSign() {
				return this.docContentSign;
			}

			public void setDocContentSign(String docContentSign) {
				this.docContentSign = docContentSign;
			}

			public Long getDocCreateTime() {
				return this.docCreateTime;
			}

			public void setDocCreateTime(Long docCreateTime) {
				this.docCreateTime = docCreateTime;
			}

			public Long getDocFocusArticleCount() {
				return this.docFocusArticleCount;
			}

			public void setDocFocusArticleCount(Long docFocusArticleCount) {
				this.docFocusArticleCount = docFocusArticleCount;
			}

			public String getDocId() {
				return this.docId;
			}

			public void setDocId(String docId) {
				this.docId = docId;
			}

			public Long getDocLikesCount() {
				return this.docLikesCount;
			}

			public void setDocLikesCount(Long docLikesCount) {
				this.docLikesCount = docLikesCount;
			}

			public String getDocMessageType() {
				return this.docMessageType;
			}

			public void setDocMessageType(String docMessageType) {
				this.docMessageType = docMessageType;
			}

			public String getDocParentId() {
				return this.docParentId;
			}

			public void setDocParentId(String docParentId) {
				this.docParentId = docParentId;
			}

			public Long getDocReadsCount() {
				return this.docReadsCount;
			}

			public void setDocReadsCount(Long docReadsCount) {
				this.docReadsCount = docReadsCount;
			}

			public Long getDocRepostCount() {
				return this.docRepostCount;
			}

			public void setDocRepostCount(Long docRepostCount) {
				this.docRepostCount = docRepostCount;
			}

			public String getDocSelfContentSign() {
				return this.docSelfContentSign;
			}

			public void setDocSelfContentSign(String docSelfContentSign) {
				this.docSelfContentSign = docSelfContentSign;
			}

			public String getDocSummary() {
				return this.docSummary;
			}

			public void setDocSummary(String docSummary) {
				this.docSummary = docSummary;
			}

			public String getDocTitle() {
				return this.docTitle;
			}

			public void setDocTitle(String docTitle) {
				this.docTitle = docTitle;
			}

			public String getDocTitleBrief() {
				return this.docTitleBrief;
			}

			public void setDocTitleBrief(String docTitleBrief) {
				this.docTitleBrief = docTitleBrief;
			}

			public String getDocUrl() {
				return this.docUrl;
			}

			public void setDocUrl(String docUrl) {
				this.docUrl = docUrl;
			}

			public String getEmotionScore() {
				return this.emotionScore;
			}

			public void setEmotionScore(String emotionScore) {
				this.emotionScore = emotionScore;
			}

			public String getEntityAlias() {
				return this.entityAlias;
			}

			public void setEntityAlias(String entityAlias) {
				this.entityAlias = entityAlias;
			}

			public String getEntityRelevancyScore() {
				return this.entityRelevancyScore;
			}

			public void setEntityRelevancyScore(String entityRelevancyScore) {
				this.entityRelevancyScore = entityRelevancyScore;
			}

			public Boolean getEroticism() {
				return this.eroticism;
			}

			public void setEroticism(Boolean eroticism) {
				this.eroticism = eroticism;
			}

			public String getEroticismScore() {
				return this.eroticismScore;
			}

			public void setEroticismScore(String eroticismScore) {
				this.eroticismScore = eroticismScore;
			}

			public Boolean getGambling() {
				return this.gambling;
			}

			public void setGambling(Boolean gambling) {
				this.gambling = gambling;
			}

			public String getHitKeywords() {
				return this.hitKeywords;
			}

			public void setHitKeywords(String hitKeywords) {
				this.hitKeywords = hitKeywords;
			}

			public Long getImageCount() {
				return this.imageCount;
			}

			public void setImageCount(Long imageCount) {
				this.imageCount = imageCount;
			}

			public Long getMediaInfluenceLevel() {
				return this.mediaInfluenceLevel;
			}

			public void setMediaInfluenceLevel(Long mediaInfluenceLevel) {
				this.mediaInfluenceLevel = mediaInfluenceLevel;
			}

			public String getMediaInfluenceScore() {
				return this.mediaInfluenceScore;
			}

			public void setMediaInfluenceScore(String mediaInfluenceScore) {
				this.mediaInfluenceScore = mediaInfluenceScore;
			}

			public String getMediaName() {
				return this.mediaName;
			}

			public void setMediaName(String mediaName) {
				this.mediaName = mediaName;
			}

			public String getMediaPropagationScore() {
				return this.mediaPropagationScore;
			}

			public void setMediaPropagationScore(String mediaPropagationScore) {
				this.mediaPropagationScore = mediaPropagationScore;
			}

			public String getMediaGroupName() {
				return this.mediaGroupName;
			}

			public void setMediaGroupName(String mediaGroupName) {
				this.mediaGroupName = mediaGroupName;
			}

			public String getMediaResCity() {
				return this.mediaResCity;
			}

			public void setMediaResCity(String mediaResCity) {
				this.mediaResCity = mediaResCity;
			}

			public String getMediaResCountry() {
				return this.mediaResCountry;
			}

			public void setMediaResCountry(String mediaResCountry) {
				this.mediaResCountry = mediaResCountry;
			}

			public String getMediaResProvince() {
				return this.mediaResProvince;
			}

			public void setMediaResProvince(String mediaResProvince) {
				this.mediaResProvince = mediaResProvince;
			}

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public Long getPublishTime() {
				return this.publishTime;
			}

			public void setPublishTime(Long publishTime) {
				this.publishTime = publishTime;
			}

			public Long getSimilarDocs() {
				return this.similarDocs;
			}

			public void setSimilarDocs(Long similarDocs) {
				this.similarDocs = similarDocs;
			}

			public Boolean getSpam() {
				return this.spam;
			}

			public void setSpam(Boolean spam) {
				this.spam = spam;
			}

			public String getWbCommentId() {
				return this.wbCommentId;
			}

			public void setWbCommentId(String wbCommentId) {
				this.wbCommentId = wbCommentId;
			}

			public String getWbMid() {
				return this.wbMid;
			}

			public void setWbMid(String wbMid) {
				this.wbMid = wbMid;
			}

			public Boolean getIsPoliticalRisk() {
				return this.isPoliticalRisk;
			}

			public void setIsPoliticalRisk(Boolean isPoliticalRisk) {
				this.isPoliticalRisk = isPoliticalRisk;
			}

			public String getContentVideoUrl() {
				return this.contentVideoUrl;
			}

			public void setContentVideoUrl(String contentVideoUrl) {
				this.contentVideoUrl = contentVideoUrl;
			}

			public String getRelevanceScore() {
				return this.relevanceScore;
			}

			public void setRelevanceScore(String relevanceScore) {
				this.relevanceScore = relevanceScore;
			}

			public String getOssVideoUrl() {
				return this.ossVideoUrl;
			}

			public void setOssVideoUrl(String ossVideoUrl) {
				this.ossVideoUrl = ossVideoUrl;
			}

			public String getDocContentType() {
				return this.docContentType;
			}

			public void setDocContentType(String docContentType) {
				this.docContentType = docContentType;
			}

			public String getOssImageUrl() {
				return this.ossImageUrl;
			}

			public void setOssImageUrl(String ossImageUrl) {
				this.ossImageUrl = ossImageUrl;
			}
		}

		public static class PageModel {

			private Integer currentPage;

			private Integer pageSize;

			private Long totalCount;

			public Integer getCurrentPage() {
				return this.currentPage;
			}

			public void setCurrentPage(Integer currentPage) {
				this.currentPage = currentPage;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public SearchDataResponse getInstance(UnmarshallerContext context) {
		return	SearchDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
