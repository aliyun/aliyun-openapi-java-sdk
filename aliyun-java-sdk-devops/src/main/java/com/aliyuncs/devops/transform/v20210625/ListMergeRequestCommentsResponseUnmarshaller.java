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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Author;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list.Author1;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list.Child_comments_list_child;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list.Child_comments_list_child.Author3;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list.Child_comments_list_child.RelatedPatchSet4;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.Child_comments_list.RelatedPatchSet2;
import com.aliyuncs.devops.model.v20210625.ListMergeRequestCommentsResponse.ResultItem.RelatedPatchSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMergeRequestCommentsResponseUnmarshaller {

	public static ListMergeRequestCommentsResponse unmarshall(ListMergeRequestCommentsResponse listMergeRequestCommentsResponse, UnmarshallerContext _ctx) {
		
		listMergeRequestCommentsResponse.setRequestId(_ctx.stringValue("ListMergeRequestCommentsResponse.requestId"));
		listMergeRequestCommentsResponse.setSuccess(_ctx.booleanValue("ListMergeRequestCommentsResponse.success"));
		listMergeRequestCommentsResponse.setErrorCode(_ctx.stringValue("ListMergeRequestCommentsResponse.errorCode"));
		listMergeRequestCommentsResponse.setErrorMessage(_ctx.stringValue("ListMergeRequestCommentsResponse.errorMessage"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMergeRequestCommentsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].commentBizId"));
			resultItem.setCommentType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].commentType"));
			resultItem.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].state"));
			resultItem.setResolved(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].resolved"));
			resultItem.setDeleted(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].deleted"));
			resultItem.setCommentTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].commentTime"));
			resultItem.setLastEditTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].lastEditTime"));
			resultItem.setContent(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].content"));
			resultItem.setLineNumber(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].lineNumber"));
			resultItem.setFilePath(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].filePath"));
			resultItem.setParentCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].parentCommentBizId"));
			resultItem.setRootCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].rootCommentBizId"));

			Author author = new Author();
			author.setAliyunPk(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.aliyunPk"));
			author.setName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.name"));
			author.setUsername(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.username"));
			author.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.state"));
			author.setAvatarUrl(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.avatarUrl"));
			author.setEmail(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].author.email"));
			resultItem.setAuthor(author);

			RelatedPatchSet relatedPatchSet = new RelatedPatchSet();
			relatedPatchSet.setPatchSetNo(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.patchSetNo"));
			relatedPatchSet.setPatchSetBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.patchSetBizId"));
			relatedPatchSet.setPatchSetName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.patchSetName"));
			relatedPatchSet.setCommitId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.commitId"));
			relatedPatchSet.setShortId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.shortId"));
			relatedPatchSet.setRelatedMergeItemType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.relatedMergeItemType"));
			relatedPatchSet.setCreatedAt(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].relatedPatchSet.createdAt"));
			resultItem.setRelatedPatchSet(relatedPatchSet);

			List<Child_comments_list> childComments = new ArrayList<Child_comments_list>();
			for (int j = 0; j < _ctx.lengthValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments.Length"); j++) {
				Child_comments_list child_comments_list = new Child_comments_list();
				child_comments_list.setCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].commentBizId"));
				child_comments_list.setCommentType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].commentType"));
				child_comments_list.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].state"));
				child_comments_list.setResolved(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].resolved"));
				child_comments_list.setDeleted(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].deleted"));
				child_comments_list.setCommentTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].commentTime"));
				child_comments_list.setLastEditTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].lastEditTime"));
				child_comments_list.setContent(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].content"));
				child_comments_list.setLineNumber(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].lineNumber"));
				child_comments_list.setFilePath(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].filePath"));
				child_comments_list.setParentCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].parentCommentBizId"));
				child_comments_list.setRootCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].rootCommentBizId"));

				Author1 author1 = new Author1();
				author1.setAliyunPk(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.aliyunPk"));
				author1.setName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.name"));
				author1.setUsername(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.username"));
				author1.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.state"));
				author1.setAvatarUrl(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.avatarUrl"));
				author1.setEmail(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].author.email"));
				child_comments_list.setAuthor1(author1);

				RelatedPatchSet2 relatedPatchSet2 = new RelatedPatchSet2();
				relatedPatchSet2.setPatchSetNo(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.patchSetNo"));
				relatedPatchSet2.setPatchSetBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.patchSetBizId"));
				relatedPatchSet2.setPatchSetName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.patchSetName"));
				relatedPatchSet2.setCommitId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.commitId"));
				relatedPatchSet2.setShortId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.shortId"));
				relatedPatchSet2.setRelatedMergeItemType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.relatedMergeItemType"));
				relatedPatchSet2.setCreatedAt(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].relatedPatchSet.createdAt"));
				child_comments_list.setRelatedPatchSet2(relatedPatchSet2);

				List<Child_comments_list_child> finalChildComments = new ArrayList<Child_comments_list_child>();
				for (int k = 0; k < _ctx.lengthValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments.Length"); k++) {
					Child_comments_list_child child_comments_list_child = new Child_comments_list_child();
					child_comments_list_child.setCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].commentBizId"));
					child_comments_list_child.setCommentType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].commentType"));
					child_comments_list_child.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].state"));
					child_comments_list_child.setResolved(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].resolved"));
					child_comments_list_child.setDeleted(_ctx.booleanValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].deleted"));
					child_comments_list_child.setCommentTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].commentTime"));
					child_comments_list_child.setLastEditTime(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].lastEditTime"));
					child_comments_list_child.setContent(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].content"));
					child_comments_list_child.setLineNumber(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].lineNumber"));
					child_comments_list_child.setFilePath(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].filePath"));
					child_comments_list_child.setParentCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].parentCommentBizId"));
					child_comments_list_child.setRootCommentBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].rootCommentBizId"));

					Author3 author3 = new Author3();
					author3.setAliyunPk(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.aliyunPk"));
					author3.setName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.name"));
					author3.setUsername(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.username"));
					author3.setState(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.state"));
					author3.setAvatarUrl(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.avatarUrl"));
					author3.setEmail(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].author.email"));
					child_comments_list_child.setAuthor3(author3);

					RelatedPatchSet4 relatedPatchSet4 = new RelatedPatchSet4();
					relatedPatchSet4.setPatchSetNo(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.patchSetNo"));
					relatedPatchSet4.setPatchSetBizId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.patchSetBizId"));
					relatedPatchSet4.setPatchSetName(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.patchSetName"));
					relatedPatchSet4.setCommitId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.commitId"));
					relatedPatchSet4.setShortId(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.shortId"));
					relatedPatchSet4.setRelatedMergeItemType(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.relatedMergeItemType"));
					relatedPatchSet4.setCreatedAt(_ctx.stringValue("ListMergeRequestCommentsResponse.result["+ i +"].childComments["+ j +"].finalChildComments["+ k +"].relatedPatchSet.createdAt"));
					child_comments_list_child.setRelatedPatchSet4(relatedPatchSet4);

					finalChildComments.add(child_comments_list_child);
				}
				child_comments_list.setFinalChildComments(finalChildComments);

				childComments.add(child_comments_list);
			}
			resultItem.setChildComments(childComments);

			result.add(resultItem);
		}
		listMergeRequestCommentsResponse.setResult(result);
	 
	 	return listMergeRequestCommentsResponse;
	}
}