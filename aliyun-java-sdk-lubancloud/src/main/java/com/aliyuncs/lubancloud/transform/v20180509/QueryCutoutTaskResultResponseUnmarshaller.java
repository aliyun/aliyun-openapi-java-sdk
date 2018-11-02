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

package com.aliyuncs.lubancloud.transform.v20180509;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lubancloud.model.v20180509.QueryCutoutTaskResultResponse;
import com.aliyuncs.lubancloud.model.v20180509.QueryCutoutTaskResultResponse.Picture;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCutoutTaskResultResponseUnmarshaller {

	public static QueryCutoutTaskResultResponse unmarshall(QueryCutoutTaskResultResponse queryCutoutTaskResultResponse, UnmarshallerContext context) {
		
		queryCutoutTaskResultResponse.setRequestId(context.stringValue("QueryCutoutTaskResultResponse.RequestId"));
		queryCutoutTaskResultResponse.setTotalSize(context.integerValue("QueryCutoutTaskResultResponse.TotalSize"));
		queryCutoutTaskResultResponse.setWaitSize(context.integerValue("QueryCutoutTaskResultResponse.WaitSize"));
		queryCutoutTaskResultResponse.setSuccessSize(context.integerValue("QueryCutoutTaskResultResponse.SuccessSize"));
		queryCutoutTaskResultResponse.setFailSize(context.integerValue("QueryCutoutTaskResultResponse.FailSize"));
		queryCutoutTaskResultResponse.setStatus(context.integerValue("QueryCutoutTaskResultResponse.Status"));

		List<Picture> pictures = new ArrayList<Picture>();
		for (int i = 0; i < context.lengthValue("QueryCutoutTaskResultResponse.Pictures.Length"); i++) {
			Picture picture = new Picture();
			picture.setOriginUrl(context.stringValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].OriginUrl"));
			picture.setCutoutUrl(context.stringValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].CutoutUrl"));
			picture.setWidth(context.integerValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].Width"));
			picture.setHeight(context.integerValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].Height"));
			picture.setStatus(context.integerValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].Status"));
			picture.setErrorCode(context.stringValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].ErrorCode"));
			picture.setErrorMessage(context.stringValue("QueryCutoutTaskResultResponse.Pictures["+ i +"].ErrorMessage"));

			pictures.add(picture);
		}
		queryCutoutTaskResultResponse.setPictures(pictures);
	 
	 	return queryCutoutTaskResultResponse;
	}
}