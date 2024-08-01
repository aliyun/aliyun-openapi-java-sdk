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

package com.aliyuncs.aicontent.transform.v20240611;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgQueryModelTrainJobListResponse;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgQueryModelTrainJobListResponse.DataItem;
import com.aliyuncs.aicontent.model.v20240611.Personalizedtxt2imgQueryModelTrainJobListResponse.DataItem.InferenceJobListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class Personalizedtxt2imgQueryModelTrainJobListResponseUnmarshaller {

	public static Personalizedtxt2imgQueryModelTrainJobListResponse unmarshall(Personalizedtxt2imgQueryModelTrainJobListResponse personalizedtxt2imgQueryModelTrainJobListResponse, UnmarshallerContext _ctx) {
		
		personalizedtxt2imgQueryModelTrainJobListResponse.setRequestId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.requestId"));
		personalizedtxt2imgQueryModelTrainJobListResponse.setSuccess(_ctx.booleanValue("Personalizedtxt2imgQueryModelTrainJobListResponse.success"));
		personalizedtxt2imgQueryModelTrainJobListResponse.setErrCode(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.errCode"));
		personalizedtxt2imgQueryModelTrainJobListResponse.setErrMessage(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.errMessage"));
		personalizedtxt2imgQueryModelTrainJobListResponse.setHttpStatusCode(_ctx.integerValue("Personalizedtxt2imgQueryModelTrainJobListResponse.httpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].id"));
			dataItem.setModelId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].modelId"));
			dataItem.setName(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].name"));
			dataItem.setObjectType(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].objectType"));
			dataItem.setJobStatus(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].jobStatus"));
			dataItem.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].jobTrainProgress"));
			dataItem.setInferenceImageCount(_ctx.integerValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceImageCount"));
			dataItem.setCreateTime(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].createTime"));

			List<String> imageUrl = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].imageUrl.Length"); j++) {
				imageUrl.add(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].imageUrl["+ j +"]"));
			}
			dataItem.setImageUrl(imageUrl);

			List<InferenceJobListItem> inferenceJobList = new ArrayList<InferenceJobListItem>();
			for (int j = 0; j < _ctx.lengthValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList.Length"); j++) {
				InferenceJobListItem inferenceJobListItem = new InferenceJobListItem();
				inferenceJobListItem.setId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].id"));
				inferenceJobListItem.setPromptId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].promptId"));
				inferenceJobListItem.setModelId(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].modelId"));
				inferenceJobListItem.setJobStatus(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].jobStatus"));
				inferenceJobListItem.setJobTrainProgress(_ctx.doubleValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].jobTrainProgress"));
				inferenceJobListItem.setCreateTime(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].createTime"));

				List<String> resultImageUrl = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].resultImageUrl.Length"); k++) {
					resultImageUrl.add(_ctx.stringValue("Personalizedtxt2imgQueryModelTrainJobListResponse.data["+ i +"].inferenceJobList["+ j +"].resultImageUrl["+ k +"]"));
				}
				inferenceJobListItem.setResultImageUrl(resultImageUrl);

				inferenceJobList.add(inferenceJobListItem);
			}
			dataItem.setInferenceJobList(inferenceJobList);

			data.add(dataItem);
		}
		personalizedtxt2imgQueryModelTrainJobListResponse.setData(data);
	 
	 	return personalizedtxt2imgQueryModelTrainJobListResponse;
	}
}