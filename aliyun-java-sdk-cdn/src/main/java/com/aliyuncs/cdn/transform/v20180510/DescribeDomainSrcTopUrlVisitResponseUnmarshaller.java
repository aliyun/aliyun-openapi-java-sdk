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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcTopUrlVisitResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcTopUrlVisitResponse.UrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcTopUrlVisitResponseUnmarshaller {

	public static DescribeDomainSrcTopUrlVisitResponse unmarshall(DescribeDomainSrcTopUrlVisitResponse describeDomainSrcTopUrlVisitResponse, UnmarshallerContext _ctx) {
		
		describeDomainSrcTopUrlVisitResponse.setRequestId(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.RequestId"));
		describeDomainSrcTopUrlVisitResponse.setDomainName(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.DomainName"));
		describeDomainSrcTopUrlVisitResponse.setStartTime(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.StartTime"));

		List<UrlList> allUrlList = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList.Length"); i++) {
			UrlList urlList = new UrlList();
			urlList.setUrlDetail(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList["+ i +"].UrlDetail"));
			urlList.setVisitData(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList["+ i +"].VisitData"));
			urlList.setVisitProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList["+ i +"].VisitProportion"));
			urlList.setFlow(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList["+ i +"].Flow"));
			urlList.setFlowProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.AllUrlList["+ i +"].FlowProportion"));

			allUrlList.add(urlList);
		}
		describeDomainSrcTopUrlVisitResponse.setAllUrlList(allUrlList);

		List<UrlList> url200List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTopUrlVisitResponse.Url200List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url200List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url200List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url200List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url200List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url200List["+ i +"].FlowProportion"));

			url200List.add(urlList_);
		}
		describeDomainSrcTopUrlVisitResponse.setUrl200List(url200List);

		List<UrlList> url300List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTopUrlVisitResponse.Url300List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url300List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url300List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url300List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url300List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url300List["+ i +"].FlowProportion"));

			url300List.add(urlList_);
		}
		describeDomainSrcTopUrlVisitResponse.setUrl300List(url300List);

		List<UrlList> url400List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTopUrlVisitResponse.Url400List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url400List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url400List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url400List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url400List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url400List["+ i +"].FlowProportion"));

			url400List.add(urlList_);
		}
		describeDomainSrcTopUrlVisitResponse.setUrl400List(url400List);

		List<UrlList> url500List = new ArrayList<UrlList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcTopUrlVisitResponse.Url500List.Length"); i++) {
			UrlList urlList_ = new UrlList();
			urlList_.setUrlDetail(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url500List["+ i +"].UrlDetail"));
			urlList_.setVisitData(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url500List["+ i +"].VisitData"));
			urlList_.setVisitProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url500List["+ i +"].VisitProportion"));
			urlList_.setFlow(_ctx.stringValue("DescribeDomainSrcTopUrlVisitResponse.Url500List["+ i +"].Flow"));
			urlList_.setFlowProportion(_ctx.floatValue("DescribeDomainSrcTopUrlVisitResponse.Url500List["+ i +"].FlowProportion"));

			url500List.add(urlList_);
		}
		describeDomainSrcTopUrlVisitResponse.setUrl500List(url500List);
	 
	 	return describeDomainSrcTopUrlVisitResponse;
	}
}