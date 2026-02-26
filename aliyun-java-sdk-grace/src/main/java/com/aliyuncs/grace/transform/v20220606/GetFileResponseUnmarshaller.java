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

package com.aliyuncs.grace.transform.v20220606;

import com.aliyuncs.grace.model.v20220606.GetFileResponse;
import com.aliyuncs.grace.model.v20220606.GetFileResponse.AnalyzeProgress;
import com.aliyuncs.grace.model.v20220606.GetFileResponse.TransferProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileResponseUnmarshaller {

	public static GetFileResponse unmarshall(GetFileResponse getFileResponse, UnmarshallerContext _ctx) {
		
		getFileResponse.setType(_ctx.stringValue("GetFileResponse.type"));
		getFileResponse.setSize(_ctx.longValue("GetFileResponse.size"));
		getFileResponse.setCreationTime(_ctx.longValue("GetFileResponse.creationTime"));
		getFileResponse.setDisplayName(_ctx.stringValue("GetFileResponse.displayName"));
		getFileResponse.setLabels(_ctx.stringValue("GetFileResponse.labels"));
		getFileResponse.setShared(_ctx.booleanValue("GetFileResponse.shared"));
		getFileResponse.setTransferState(_ctx.stringValue("GetFileResponse.transferState"));
		getFileResponse.setName(_ctx.stringValue("GetFileResponse.name"));
		getFileResponse.setRequestId(_ctx.stringValue("GetFileResponse.requestId"));

		AnalyzeProgress analyzeProgress = new AnalyzeProgress();
		analyzeProgress.setMessage(_ctx.stringValue("GetFileResponse.analyzeProgress.message"));
		analyzeProgress.setPercent(_ctx.doubleValue("GetFileResponse.analyzeProgress.percent"));
		analyzeProgress.setState(_ctx.stringValue("GetFileResponse.analyzeProgress.state"));
		getFileResponse.setAnalyzeProgress(analyzeProgress);

		TransferProgress transferProgress = new TransferProgress();
		transferProgress.setTotalSize(_ctx.longValue("GetFileResponse.transferProgress.totalSize"));
		transferProgress.setTransferredSize(_ctx.longValue("GetFileResponse.transferProgress.transferredSize"));
		getFileResponse.setTransferProgress(transferProgress);
	 
	 	return getFileResponse;
	}
}