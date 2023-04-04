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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AddressesItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem.CroppingSuggestionsItem6;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem.CroppingSuggestionsItem6.Boundary7;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem.ImageScore3;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem.OCRContentsItem8;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioCoversItem.OCRContentsItem8.Boundary9;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.CroppingSuggestionsItem.Boundary1;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.FiguresItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.ImageScore;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.LabelsItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.OCRContentsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.QueryFigureClustersResponse.FigureClustersItem.Cover.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFigureClustersResponseUnmarshaller {

	public static QueryFigureClustersResponse unmarshall(QueryFigureClustersResponse queryFigureClustersResponse, UnmarshallerContext _ctx) {
		
		queryFigureClustersResponse.setRequestId(_ctx.stringValue("QueryFigureClustersResponse.RequestId"));
		queryFigureClustersResponse.setNextToken(_ctx.stringValue("QueryFigureClustersResponse.NextToken"));

		List<FigureClustersItem> figureClusters = new ArrayList<FigureClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters.Length"); i++) {
			FigureClustersItem figureClustersItem = new FigureClustersItem();
			figureClustersItem.setOwnerId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].OwnerId"));
			figureClustersItem.setProjectName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].ProjectName"));
			figureClustersItem.setDatasetName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].DatasetName"));
			figureClustersItem.setObjectType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].ObjectType"));
			figureClustersItem.setObjectId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].ObjectId"));
			figureClustersItem.setUpdateTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].UpdateTime"));
			figureClustersItem.setCreateTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].CreateTime"));
			figureClustersItem.setName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Name"));
			figureClustersItem.setGender(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Gender"));
			figureClustersItem.setFaceCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].FaceCount"));
			figureClustersItem.setImageCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].ImageCount"));
			figureClustersItem.setVideoCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].VideoCount"));
			figureClustersItem.setAverageAge(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].AverageAge"));
			figureClustersItem.setMinAge(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].MinAge"));
			figureClustersItem.setMaxAge(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].MaxAge"));
			figureClustersItem.setCustomId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].CustomId"));
			figureClustersItem.setCustomLabels(_ctx.mapValue("QueryFigureClustersResponse.FigureClusters["+ i +"].CustomLabels"));
			figureClustersItem.setMetaLockVersion(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].MetaLockVersion"));

			Cover cover = new Cover();
			cover.setOwnerId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OwnerId"));
			cover.setProjectName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ProjectName"));
			cover.setDatasetName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.DatasetName"));
			cover.setObjectType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ObjectType"));
			cover.setObjectId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ObjectId"));
			cover.setUpdateTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.UpdateTime"));
			cover.setCreateTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CreateTime"));
			cover.setURI(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.URI"));
			cover.setOSSURI(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSURI"));
			cover.setFilename(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Filename"));
			cover.setMediaType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.MediaType"));
			cover.setContentType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ContentType"));
			cover.setSize(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Size"));
			cover.setFileHash(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FileHash"));
			cover.setFileModifiedTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FileModifiedTime"));
			cover.setFileCreateTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FileCreateTime"));
			cover.setFileAccessTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FileAccessTime"));
			cover.setProduceTime(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ProduceTime"));
			cover.setLatLong(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.LatLong"));
			cover.setTimezone(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Timezone"));
			cover.setTravelClusterId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.TravelClusterId"));
			cover.setOrientation(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Orientation"));
			cover.setFigureCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FigureCount"));
			cover.setTitle(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Title"));
			cover.setImageWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ImageWidth"));
			cover.setImageHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ImageHeight"));
			cover.setEXIF(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.EXIF"));
			cover.setVideoWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoWidth"));
			cover.setVideoHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoHeight"));
			cover.setArtist(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Artist"));
			cover.setAlbumArtist(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AlbumArtist"));
			cover.setComposer(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Composer"));
			cover.setPerformer(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Performer"));
			cover.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Language"));
			cover.setAlbum(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Album"));
			cover.setDocumentLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.DocumentLanguage"));
			cover.setPageCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.PageCount"));
			cover.setDocumentContent(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.DocumentContent"));
			cover.setETag(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ETag"));
			cover.setCacheControl(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CacheControl"));
			cover.setContentDisposition(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ContentDisposition"));
			cover.setContentEncoding(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ContentEncoding"));
			cover.setContentLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ContentLanguage"));
			cover.setAccessControlAllowOrigin(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AccessControlAllowOrigin"));
			cover.setAccessControlRequestMethod(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AccessControlRequestMethod"));
			cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ServerSideEncryptionCustomerAlgorithm"));
			cover.setServerSideEncryption(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ServerSideEncryption"));
			cover.setServerSideDataEncryption(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ServerSideDataEncryption"));
			cover.setServerSideEncryptionKeyId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ServerSideEncryptionKeyId"));
			cover.setOSSStorageClass(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSStorageClass"));
			cover.setOSSCRC64(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSCRC64"));
			cover.setObjectACL(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ObjectACL"));
			cover.setContentMd5(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ContentMd5"));
			cover.setOSSUserMeta(_ctx.mapValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSUserMeta"));
			cover.setOSSTaggingCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSTaggingCount"));
			cover.setOSSTagging(_ctx.mapValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSTagging"));
			cover.setOSSExpiration(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSExpiration"));
			cover.setOSSVersionId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSVersionId"));
			cover.setOSSDeleteMarker(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSDeleteMarker"));
			cover.setOSSObjectType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OSSObjectType"));
			cover.setCustomId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CustomId"));
			cover.setCustomLabels(_ctx.mapValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CustomLabels"));
			cover.setStreamCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.StreamCount"));
			cover.setProgramCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ProgramCount"));
			cover.setFormatName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FormatName"));
			cover.setFormatLongName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.FormatLongName"));
			cover.setStartTime(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.StartTime"));
			cover.setBitrate(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Bitrate"));
			cover.setDuration(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Duration"));

			ImageScore imageScore = new ImageScore();
			imageScore.setOverallQualityScore(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.ImageScore.OverallQualityScore"));
			cover.setImageScore(imageScore);

			List<AddressesItem> addresses = new ArrayList<AddressesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses.Length"); j++) {
				AddressesItem addressesItem = new AddressesItem();
				addressesItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].Language"));
				addressesItem.setAddressLine(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].AddressLine"));
				addressesItem.setCountry(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].Country"));
				addressesItem.setProvince(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].Province"));
				addressesItem.setCity(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].City"));
				addressesItem.setDistrict(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].District"));
				addressesItem.setTownship(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Addresses["+ j +"].Township"));

				addresses.add(addressesItem);
			}
			cover.setAddresses(addresses);

			List<FiguresItem> figures = new ArrayList<FiguresItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures.Length"); j++) {
				FiguresItem figuresItem = new FiguresItem();
				figuresItem.setFigureId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FigureId"));
				figuresItem.setFigureConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FigureConfidence"));
				figuresItem.setFigureClusterId(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FigureClusterId"));
				figuresItem.setFigureClusterConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FigureClusterConfidence"));
				figuresItem.setFigureType(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FigureType"));
				figuresItem.setAge(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Age"));
				figuresItem.setAgeSD(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].AgeSD"));
				figuresItem.setGender(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Gender"));
				figuresItem.setGenderConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].GenderConfidence"));
				figuresItem.setEmotion(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Emotion"));
				figuresItem.setEmotionConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].EmotionConfidence"));
				figuresItem.setFaceQuality(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].FaceQuality"));
				figuresItem.setMouth(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Mouth"));
				figuresItem.setMouthConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].MouthConfidence"));
				figuresItem.setBeard(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Beard"));
				figuresItem.setBeardConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].BeardConfidence"));
				figuresItem.setHat(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Hat"));
				figuresItem.setHatConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].HatConfidence"));
				figuresItem.setMask(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Mask"));
				figuresItem.setMaskConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].MaskConfidence"));
				figuresItem.setGlasses(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Glasses"));
				figuresItem.setGlassesConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].GlassesConfidence"));
				figuresItem.setSharpness(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Sharpness"));
				figuresItem.setAttractive(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Attractive"));

				Boundary boundary = new Boundary();
				boundary.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Boundary.Width"));
				boundary.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Boundary.Height"));
				boundary.setLeft(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Boundary.Left"));
				boundary.setTop(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].Boundary.Top"));
				figuresItem.setBoundary(boundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Figures["+ j +"].HeadPose.Yaw"));
				figuresItem.setHeadPose(headPose);

				figures.add(figuresItem);
			}
			cover.setFigures(figures);

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].Language"));
				labelsItem.setLabelName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].LabelName"));
				labelsItem.setLabelLevel(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].LabelLevel"));
				labelsItem.setLabelConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].LabelConfidence"));
				labelsItem.setParentLabelName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].ParentLabelName"));
				labelsItem.setCentricScore(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Labels["+ j +"].CentricScore"));

				labels.add(labelsItem);
			}
			cover.setLabels(labels);

			List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
				croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem.setConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].Confidence"));

				Boundary1 boundary1 = new Boundary1();
				boundary1.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary1.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary1.setLeft(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary1.setTop(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem.setBoundary1(boundary1);

				croppingSuggestions.add(croppingSuggestionsItem);
			}
			cover.setCroppingSuggestions(croppingSuggestions);

			List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents.Length"); j++) {
				OCRContentsItem oCRContentsItem = new OCRContentsItem();
				oCRContentsItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Language"));
				oCRContentsItem.setContents(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Contents"));
				oCRContentsItem.setConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Confidence"));

				Boundary2 boundary2 = new Boundary2();
				boundary2.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Boundary.Width"));
				boundary2.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Boundary.Height"));
				boundary2.setLeft(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Boundary.Left"));
				boundary2.setTop(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem.setBoundary2(boundary2);

				oCRContents.add(oCRContentsItem);
			}
			cover.setOCRContents(oCRContents);

			List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams.Length"); j++) {
				VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
				videoStreamsItem.setIndex(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Index"));
				videoStreamsItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Language"));
				videoStreamsItem.setCodecName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].CodecName"));
				videoStreamsItem.setCodecLongName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem.setProfile(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Profile"));
				videoStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem.setCodecTagString(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem.setCodecTag(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Width"));
				videoStreamsItem.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Height"));
				videoStreamsItem.setHasBFrames(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem.setPixelFormat(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem.setLevel(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Level"));
				videoStreamsItem.setFrameRate(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem.setAverageFrameRate(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem.setTimeBase(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem.setStartTime(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].StartTime"));
				videoStreamsItem.setDuration(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Duration"));
				videoStreamsItem.setBitrate(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem.setFrameCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem.setRotate(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].Rotate"));
				videoStreamsItem.setBitDepth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem.setColorSpace(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem.setColorRange(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem.setColorTransfer(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem.setColorPrimaries(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams.add(videoStreamsItem);
			}
			cover.setVideoStreams(videoStreams);

			List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles.Length"); j++) {
				SubtitlesItem subtitlesItem = new SubtitlesItem();
				subtitlesItem.setIndex(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Index"));
				subtitlesItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Language"));
				subtitlesItem.setCodecName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].CodecName"));
				subtitlesItem.setCodecLongName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].CodecLongName"));
				subtitlesItem.setCodecTagString(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].CodecTagString"));
				subtitlesItem.setCodecTag(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].CodecTag"));
				subtitlesItem.setStartTime(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].StartTime"));
				subtitlesItem.setDuration(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Duration"));
				subtitlesItem.setBitrate(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Bitrate"));
				subtitlesItem.setContent(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Content"));
				subtitlesItem.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Width"));
				subtitlesItem.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.Subtitles["+ j +"].Height"));

				subtitles.add(subtitlesItem);
			}
			cover.setSubtitles(subtitles);

			List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams.Length"); j++) {
				AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
				audioStreamsItem.setIndex(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Index"));
				audioStreamsItem.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Language"));
				audioStreamsItem.setCodecName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].CodecName"));
				audioStreamsItem.setCodecLongName(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem.setCodecTagString(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem.setCodecTag(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem.setTimeBase(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem.setStartTime(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].StartTime"));
				audioStreamsItem.setDuration(_ctx.doubleValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Duration"));
				audioStreamsItem.setBitrate(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem.setFrameCount(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem.setLyric(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Lyric"));
				audioStreamsItem.setSampleFormat(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem.setSampleRate(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem.setChannels(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].Channels"));
				audioStreamsItem.setChannelLayout(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioStreams["+ j +"].ChannelLayout"));

				audioStreams.add(audioStreamsItem);
			}
			cover.setAudioStreams(audioStreams);

			List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers.Length"); j++) {
				AudioCoversItem audioCoversItem = new AudioCoversItem();
				audioCoversItem.setImageWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem.setImageHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem.setEXIF(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].EXIF"));

				ImageScore3 imageScore3 = new ImageScore3();
				imageScore3.setOverallQualityScore(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem.setImageScore3(imageScore3);

				List<CroppingSuggestionsItem6> croppingSuggestions4 = new ArrayList<CroppingSuggestionsItem6>();
				for (int k = 0; k < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem6 croppingSuggestionsItem6 = new CroppingSuggestionsItem6();
					croppingSuggestionsItem6.setAspectRatio(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem6.setConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary7 boundary7 = new Boundary7();
					boundary7.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary7.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary7.setLeft(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary7.setTop(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem6.setBoundary7(boundary7);

					croppingSuggestions4.add(croppingSuggestionsItem6);
				}
				audioCoversItem.setCroppingSuggestions4(croppingSuggestions4);

				List<OCRContentsItem8> oCRContents5 = new ArrayList<OCRContentsItem8>();
				for (int k = 0; k < _ctx.lengthValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem8 oCRContentsItem8 = new OCRContentsItem8();
					oCRContentsItem8.setLanguage(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem8.setContents(_ctx.stringValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem8.setConfidence(_ctx.floatValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary9 boundary9 = new Boundary9();
					boundary9.setWidth(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary9.setHeight(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary9.setLeft(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary9.setTop(_ctx.longValue("QueryFigureClustersResponse.FigureClusters["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem8.setBoundary9(boundary9);

					oCRContents5.add(oCRContentsItem8);
				}
				audioCoversItem.setOCRContents5(oCRContents5);

				audioCovers.add(audioCoversItem);
			}
			cover.setAudioCovers(audioCovers);
			figureClustersItem.setCover(cover);

			figureClusters.add(figureClustersItem);
		}
		queryFigureClustersResponse.setFigureClusters(figureClusters);
	 
	 	return queryFigureClustersResponse;
	}
}