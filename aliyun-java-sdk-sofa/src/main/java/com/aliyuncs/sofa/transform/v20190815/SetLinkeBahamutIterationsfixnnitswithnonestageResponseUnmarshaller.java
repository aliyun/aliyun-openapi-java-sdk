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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationsfixnnitswithnonestageResponse;
import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutIterationsfixnnitswithnonestageResponseUnmarshaller {

	public static SetLinkeBahamutIterationsfixnnitswithnonestageResponse unmarshall(SetLinkeBahamutIterationsfixnnitswithnonestageResponse setLinkeBahamutIterationsfixnnitswithnonestageResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.RequestId"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ResultCode"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ResultMessage"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ErrorMessage"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ErrorMsgParamsMap"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setMessage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Message"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.ResponseStatusCode"));
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("SetLinkeBahamutIterationsfixnnitswithnonestageResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		setLinkeBahamutIterationsfixnnitswithnonestageResponse.setResult(result);
	 
	 	return setLinkeBahamutIterationsfixnnitswithnonestageResponse;
	}
}