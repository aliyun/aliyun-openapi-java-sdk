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

import com.aliyuncs.lubancloud.model.v20180509.QueryGenerateTaskResultResponse;
import com.aliyuncs.lubancloud.model.v20180509.QueryGenerateTaskResultResponse.Picture;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGenerateTaskResultResponseUnmarshaller {

	public static QueryGenerateTaskResultResponse unmarshall(QueryGenerateTaskResultResponse queryGenerateTaskResultResponse, UnmarshallerContext context) {
		
		queryGenerateTaskResultResponse.setRequestId(context.stringValue("QueryGenerateTaskResultResponse.RequestId"));
		queryGenerateTaskResultResponse.setTotalSize(context.integerValue("QueryGenerateTaskResultResponse.TotalSize"));
		queryGenerateTaskResultResponse.setWaitSize(context.integerValue("QueryGenerateTaskResultResponse.WaitSize"));
		queryGenerateTaskResultResponse.setSuccessSize(context.integerValue("QueryGenerateTaskResultResponse.SuccessSize"));
		queryGenerateTaskResultResponse.setFailSize(context.integerValue("QueryGenerateTaskResultResponse.FailSize"));
		queryGenerateTaskResultResponse.setStatus(context.integerValue("QueryGenerateTaskResultResponse.Status"));

		List<Picture> pictures = new ArrayList<Picture>();
		for (int i = 0; i < context.lengthValue("QueryGenerateTaskResultResponse.Pictures.Length"); i++) {
			Picture picture = new Picture();
			picture.setId(context.longValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].Id"));
			picture.setName(context.stringValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].Name"));
			picture.setPreviewUrl(context.stringValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].PreviewUrl"));
			picture.setWidth(context.integerValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].Width"));
			picture.setHeight(context.integerValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].Height"));
			picture.setStatus(context.integerValue("QueryGenerateTaskResultResponse.Pictures["+ i +"].Status"));

			pictures.add(picture);
		}
		queryGenerateTaskResultResponse.setPictures(pictures);
	 
	 	return queryGenerateTaskResultResponse;
	}
}