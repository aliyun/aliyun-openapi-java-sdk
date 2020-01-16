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

package com.aliyuncs.hitsdb.transform.v20170601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataResponse;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataResponse.TimeLine;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataResponse.TimeLine.Point;
import com.aliyuncs.hitsdb.model.v20170601.ExploreHiTSDBInstanceDataResponse.TimeLine.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreHiTSDBInstanceDataResponseUnmarshaller {

	public static ExploreHiTSDBInstanceDataResponse unmarshall(ExploreHiTSDBInstanceDataResponse exploreHiTSDBInstanceDataResponse, UnmarshallerContext _ctx) {
		
		exploreHiTSDBInstanceDataResponse.setRequestId(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.RequestId"));
		exploreHiTSDBInstanceDataResponse.setStart(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.Start"));
		exploreHiTSDBInstanceDataResponse.setEnd(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.End"));
		exploreHiTSDBInstanceDataResponse.setMetric(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.Metric"));

		List<TimeLine> timeLines = new ArrayList<TimeLine>();
		for (int i = 0; i < _ctx.lengthValue("ExploreHiTSDBInstanceDataResponse.TimeLines.Length"); i++) {
			TimeLine timeLine = new TimeLine();

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			timeLine.setTags(tags);

			List<Point> series = new ArrayList<Point>();
			for (int j = 0; j < _ctx.lengthValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Series.Length"); j++) {
				Point point = new Point();
				point.setTimestamp(_ctx.stringValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Series["+ j +"].Timestamp"));
				point.setValue(_ctx.floatValue("ExploreHiTSDBInstanceDataResponse.TimeLines["+ i +"].Series["+ j +"].Value"));

				series.add(point);
			}
			timeLine.setSeries(series);

			timeLines.add(timeLine);
		}
		exploreHiTSDBInstanceDataResponse.setTimeLines(timeLines);
	 
	 	return exploreHiTSDBInstanceDataResponse;
	}
}