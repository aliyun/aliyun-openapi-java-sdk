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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse;
import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse.DNAResult;
import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse.DNAResult.VideoDNAItem;
import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse.DNAResult.VideoDNAItem.DetailItem;
import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse.DNAResult.VideoDNAItem.DetailItem.Duplication;
import com.aliyuncs.vod.model.v20170321.GetMediaDNAResultResponse.DNAResult.VideoDNAItem.DetailItem.Input;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaDNAResultResponseUnmarshaller {

	public static GetMediaDNAResultResponse unmarshall(GetMediaDNAResultResponse getMediaDNAResultResponse, UnmarshallerContext context) {
		
		getMediaDNAResultResponse.setRequestId(context.stringValue("GetMediaDNAResultResponse.RequestId"));

		DNAResult dNAResult = new DNAResult();

		List<VideoDNAItem> videoDNA = new ArrayList<VideoDNAItem>();
		for (int i = 0; i < context.lengthValue("GetMediaDNAResultResponse.DNAResult.VideoDNA.Length"); i++) {
			VideoDNAItem videoDNAItem = new VideoDNAItem();
			videoDNAItem.setPrimaryKey(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].PrimaryKey"));
			videoDNAItem.setSimilarity(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Similarity"));

			List<DetailItem> detail = new ArrayList<DetailItem>();
			for (int j = 0; j < context.lengthValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Detail.Length"); j++) {
				DetailItem detailItem = new DetailItem();

				Input input = new Input();
				input.setStart(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Detail["+ j +"].Input.Start"));
				input.setDuration(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Detail["+ j +"].Input.Duration"));
				detailItem.setInput(input);

				Duplication duplication = new Duplication();
				duplication.setStart(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Detail["+ j +"].Duplication.Start"));
				duplication.setDuration(context.stringValue("GetMediaDNAResultResponse.DNAResult.VideoDNA["+ i +"].Detail["+ j +"].Duplication.Duration"));
				detailItem.setDuplication(duplication);

				detail.add(detailItem);
			}
			videoDNAItem.setDetail(detail);

			videoDNA.add(videoDNAItem);
		}
		dNAResult.setVideoDNA(videoDNA);
		getMediaDNAResultResponse.setDNAResult(dNAResult);
	 
	 	return getMediaDNAResultResponse;
	}
}