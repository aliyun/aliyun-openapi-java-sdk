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

package com.aliyuncs.idsp.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idsp.model.v20200710.SearchDataResponse;
import com.aliyuncs.idsp.model.v20200710.SearchDataResponse.Data;
import com.aliyuncs.idsp.model.v20200710.SearchDataResponse.Data.PageModel;
import com.aliyuncs.idsp.model.v20200710.SearchDataResponse.Data.YqMessageViewModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDataResponseUnmarshaller {

	public static SearchDataResponse unmarshall(SearchDataResponse searchDataResponse, UnmarshallerContext _ctx) {
		
		searchDataResponse.setRequestId(_ctx.stringValue("SearchDataResponse.RequestId"));
		searchDataResponse.setSuccess(_ctx.booleanValue("SearchDataResponse.Success"));
		searchDataResponse.setCode(_ctx.stringValue("SearchDataResponse.Code"));
		searchDataResponse.setMessage(_ctx.stringValue("SearchDataResponse.Message"));

		Data data = new Data();

		PageModel pageModel = new PageModel();
		pageModel.setCurrentPage(_ctx.integerValue("SearchDataResponse.Data.PageModel.CurrentPage"));
		pageModel.setPageSize(_ctx.integerValue("SearchDataResponse.Data.PageModel.PageSize"));
		pageModel.setTotalCount(_ctx.longValue("SearchDataResponse.Data.PageModel.TotalCount"));
		data.setPageModel(pageModel);

		List<YqMessageViewModel> list = new ArrayList<YqMessageViewModel>();
		for (int i = 0; i < _ctx.lengthValue("SearchDataResponse.Data.List.Length"); i++) {
			YqMessageViewModel yqMessageViewModel = new YqMessageViewModel();
			yqMessageViewModel.setVideoUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].VideoUrl"));
			yqMessageViewModel.setOssUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].OssUrl"));
			yqMessageViewModel.setVideoImageUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].VideoImageUrl"));
			yqMessageViewModel.setViewsCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].ViewsCount"));
			yqMessageViewModel.setWeChartTags(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].WeChartTags"));
			yqMessageViewModel.setWeChartKeywords(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].WeChartKeywords"));
			yqMessageViewModel.setAdvertisement(_ctx.booleanValue("SearchDataResponse.Data.List["+ i +"].Advertisement"));
			yqMessageViewModel.setAuthorAvatarUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorAvatarUrl"));
			yqMessageViewModel.setAuthorFollowersCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].AuthorFollowersCount"));
			yqMessageViewModel.setAuthorFriendsCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].AuthorFriendsCount"));
			yqMessageViewModel.setAuthorId(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorId"));
			yqMessageViewModel.setAuthorName(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorName"));
			yqMessageViewModel.setAuthorProfileUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorProfileUrl"));
			yqMessageViewModel.setAuthorStatusesCount(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorStatusesCount"));
			yqMessageViewModel.setAuthorVerifyType(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].AuthorVerifyType"));
			yqMessageViewModel.setContentEmotionType(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].ContentEmotionType"));
			yqMessageViewModel.setContentImageUrlList(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].ContentImageUrlList"));
			yqMessageViewModel.setCreationTime(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].CreationTime"));
			yqMessageViewModel.setDocAncestorId(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocAncestorId"));
			yqMessageViewModel.setDocAnswersCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocAnswersCount"));
			yqMessageViewModel.setDocCommentsCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocCommentsCount"));
			yqMessageViewModel.setDocContent(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocContent"));
			yqMessageViewModel.setDocContentBrief(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocContentBrief"));
			yqMessageViewModel.setDocContentSign(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocContentSign"));
			yqMessageViewModel.setDocCreateTime(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocCreateTime"));
			yqMessageViewModel.setDocFocusArticleCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocFocusArticleCount"));
			yqMessageViewModel.setDocId(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocId"));
			yqMessageViewModel.setDocLikesCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocLikesCount"));
			yqMessageViewModel.setDocMessageType(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocMessageType"));
			yqMessageViewModel.setDocParentId(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocParentId"));
			yqMessageViewModel.setDocReadsCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocReadsCount"));
			yqMessageViewModel.setDocRepostCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].DocRepostCount"));
			yqMessageViewModel.setDocSelfContentSign(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocSelfContentSign"));
			yqMessageViewModel.setDocSummary(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocSummary"));
			yqMessageViewModel.setDocTitle(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocTitle"));
			yqMessageViewModel.setDocTitleBrief(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocTitleBrief"));
			yqMessageViewModel.setDocUrl(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].DocUrl"));
			yqMessageViewModel.setEmotionScore(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].EmotionScore"));
			yqMessageViewModel.setEntityAlias(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].EntityAlias"));
			yqMessageViewModel.setEntityRelevancyScore(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].EntityRelevancyScore"));
			yqMessageViewModel.setEroticism(_ctx.booleanValue("SearchDataResponse.Data.List["+ i +"].Eroticism"));
			yqMessageViewModel.setEroticismScore(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].EroticismScore"));
			yqMessageViewModel.setGambling(_ctx.booleanValue("SearchDataResponse.Data.List["+ i +"].Gambling"));
			yqMessageViewModel.setHitKeywords(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].HitKeywords"));
			yqMessageViewModel.setImageCount(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].ImageCount"));
			yqMessageViewModel.setMediaInfluenceLevel(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].MediaInfluenceLevel"));
			yqMessageViewModel.setMediaInfluenceScore(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaInfluenceScore"));
			yqMessageViewModel.setMediaName(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaName"));
			yqMessageViewModel.setMediaPropagationScore(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaPropagationScore"));
			yqMessageViewModel.setMediaGroupName(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaGroupName"));
			yqMessageViewModel.setMediaResCity(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaResCity"));
			yqMessageViewModel.setMediaResCountry(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaResCountry"));
			yqMessageViewModel.setMediaResProvince(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaResProvince"));
			yqMessageViewModel.setMediaType(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].MediaType"));
			yqMessageViewModel.setPublishTime(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].PublishTime"));
			yqMessageViewModel.setSimilarDocs(_ctx.longValue("SearchDataResponse.Data.List["+ i +"].SimilarDocs"));
			yqMessageViewModel.setSpam(_ctx.booleanValue("SearchDataResponse.Data.List["+ i +"].Spam"));
			yqMessageViewModel.setWbCommentId(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].WbCommentId"));
			yqMessageViewModel.setWbMid(_ctx.stringValue("SearchDataResponse.Data.List["+ i +"].WbMid"));

			list.add(yqMessageViewModel);
		}
		data.setList(list);
		searchDataResponse.setData(data);
	 
	 	return searchDataResponse;
	}
}