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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse;
import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse.BaselineItem;
import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse.ErrorInfo;
import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse.Inputs;
import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse.Inputs.BaselineItem2;
import com.aliyuncs.governance.model.v20210120.GetEnrolledAccountResponse.Progres;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEnrolledAccountResponseUnmarshaller {

	public static GetEnrolledAccountResponse unmarshall(GetEnrolledAccountResponse getEnrolledAccountResponse, UnmarshallerContext _ctx) {
		
		getEnrolledAccountResponse.setRequestId(_ctx.stringValue("GetEnrolledAccountResponse.RequestId"));
		getEnrolledAccountResponse.setAccountUid(_ctx.longValue("GetEnrolledAccountResponse.AccountUid"));
		getEnrolledAccountResponse.setBaselineId(_ctx.stringValue("GetEnrolledAccountResponse.BaselineId"));
		getEnrolledAccountResponse.setCreateTime(_ctx.stringValue("GetEnrolledAccountResponse.CreateTime"));
		getEnrolledAccountResponse.setDisplayName(_ctx.stringValue("GetEnrolledAccountResponse.DisplayName"));
		getEnrolledAccountResponse.setFolderId(_ctx.stringValue("GetEnrolledAccountResponse.FolderId"));
		getEnrolledAccountResponse.setInitialized(_ctx.booleanValue("GetEnrolledAccountResponse.Initialized"));
		getEnrolledAccountResponse.setMasterAccountUid(_ctx.longValue("GetEnrolledAccountResponse.MasterAccountUid"));
		getEnrolledAccountResponse.setPayerAccountUid(_ctx.longValue("GetEnrolledAccountResponse.PayerAccountUid"));
		getEnrolledAccountResponse.setStatus(_ctx.stringValue("GetEnrolledAccountResponse.Status"));
		getEnrolledAccountResponse.setUpdateTime(_ctx.stringValue("GetEnrolledAccountResponse.UpdateTime"));

		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setCode(_ctx.stringValue("GetEnrolledAccountResponse.ErrorInfo.Code"));
		errorInfo.setMessage(_ctx.stringValue("GetEnrolledAccountResponse.ErrorInfo.Message"));
		errorInfo.setRecommend(_ctx.stringValue("GetEnrolledAccountResponse.ErrorInfo.Recommend"));
		errorInfo.setRequestId(_ctx.stringValue("GetEnrolledAccountResponse.ErrorInfo.RequestId"));
		getEnrolledAccountResponse.setErrorInfo(errorInfo);

		Inputs inputs = new Inputs();
		inputs.setAccountNamePrefix(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.AccountNamePrefix"));
		inputs.setAccountUid(_ctx.longValue("GetEnrolledAccountResponse.Inputs.AccountUid"));
		inputs.setDisplayName(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.DisplayName"));
		inputs.setFolderId(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.FolderId"));
		inputs.setPayerAccountUid(_ctx.longValue("GetEnrolledAccountResponse.Inputs.PayerAccountUid"));

		List<BaselineItem2> baselineItems1 = new ArrayList<BaselineItem2>();
		for (int i = 0; i < _ctx.lengthValue("GetEnrolledAccountResponse.Inputs.BaselineItems.Length"); i++) {
			BaselineItem2 baselineItem2 = new BaselineItem2();
			baselineItem2.setConfig(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.BaselineItems["+ i +"].Config"));
			baselineItem2.setName(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.BaselineItems["+ i +"].Name"));
			baselineItem2.setSkip(_ctx.booleanValue("GetEnrolledAccountResponse.Inputs.BaselineItems["+ i +"].Skip"));
			baselineItem2.setVersion(_ctx.stringValue("GetEnrolledAccountResponse.Inputs.BaselineItems["+ i +"].Version"));

			baselineItems1.add(baselineItem2);
		}
		inputs.setBaselineItems1(baselineItems1);
		getEnrolledAccountResponse.setInputs(inputs);

		List<BaselineItem> baselineItems = new ArrayList<BaselineItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEnrolledAccountResponse.BaselineItems.Length"); i++) {
			BaselineItem baselineItem = new BaselineItem();
			baselineItem.setConfig(_ctx.stringValue("GetEnrolledAccountResponse.BaselineItems["+ i +"].Config"));
			baselineItem.setName(_ctx.stringValue("GetEnrolledAccountResponse.BaselineItems["+ i +"].Name"));
			baselineItem.setSkip(_ctx.booleanValue("GetEnrolledAccountResponse.BaselineItems["+ i +"].Skip"));
			baselineItem.setVersion(_ctx.stringValue("GetEnrolledAccountResponse.BaselineItems["+ i +"].Version"));

			baselineItems.add(baselineItem);
		}
		getEnrolledAccountResponse.setBaselineItems(baselineItems);

		List<Progres> progress = new ArrayList<Progres>();
		for (int i = 0; i < _ctx.lengthValue("GetEnrolledAccountResponse.Progress.Length"); i++) {
			Progres progres = new Progres();
			progres.setName(_ctx.stringValue("GetEnrolledAccountResponse.Progress["+ i +"].Name"));
			progres.setStatus(_ctx.stringValue("GetEnrolledAccountResponse.Progress["+ i +"].Status"));

			progress.add(progres);
		}
		getEnrolledAccountResponse.setProgress(progress);
	 
	 	return getEnrolledAccountResponse;
	}
}