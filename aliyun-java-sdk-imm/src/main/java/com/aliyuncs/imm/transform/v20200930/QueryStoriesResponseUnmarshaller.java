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

import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.AddressesItem11;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AddressesItem22;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34.CroppingSuggestionsItem38;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34.CroppingSuggestionsItem38.Boundary39;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34.ImageScore35;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34.OCRContentsItem40;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioCoversItem34.OCRContentsItem40.Boundary41;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.AudioStreamsItem33;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.CroppingSuggestionsItem27;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.CroppingSuggestionsItem27.Boundary28;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem23;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem23.Boundary24;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.FiguresItem23.HeadPose25;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.ImageScore12;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.LabelsItem26;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.OCRContentsItem29;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.OCRContentsItem29.Boundary30;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.SubtitlesItem32;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.Cover.VideoStreamsItem31;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AddressesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.CroppingSuggestionsItem7;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.CroppingSuggestionsItem7.Boundary8;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.ImageScore4;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.OCRContentsItem9;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioCoversItem.OCRContentsItem9.Boundary10;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.CroppingSuggestionsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.ImageScore;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.LabelsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.OCRContentsItem.Boundary3;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.QueryStoriesResponse.StoriesItem.FilesItem.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryStoriesResponseUnmarshaller {

	public static QueryStoriesResponse unmarshall(QueryStoriesResponse queryStoriesResponse, UnmarshallerContext _ctx) {
		
		queryStoriesResponse.setRequestId(_ctx.stringValue("QueryStoriesResponse.RequestId"));
		queryStoriesResponse.setNextToken(_ctx.stringValue("QueryStoriesResponse.NextToken"));

		List<StoriesItem> stories = new ArrayList<StoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryStoriesResponse.Stories.Length"); i++) {
			StoriesItem storiesItem = new StoriesItem();
			storiesItem.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].OwnerId"));
			storiesItem.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ProjectName"));
			storiesItem.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].DatasetName"));
			storiesItem.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ObjectId"));
			storiesItem.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].ObjectType"));
			storiesItem.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].UpdateTime"));
			storiesItem.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].CreateTime"));
			storiesItem.setStoryName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryName"));
			storiesItem.setStoryType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryType"));
			storiesItem.setStorySubType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StorySubType"));
			storiesItem.setStoryStartTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryStartTime"));
			storiesItem.setStoryEndTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].StoryEndTime"));
			storiesItem.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].CustomId"));
			storiesItem.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].CustomLabels"));

			List<String> figureClusterIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].FigureClusterIds.Length"); j++) {
				figureClusterIds.add(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].FigureClusterIds["+ j +"]"));
			}
			storiesItem.setFigureClusterIds(figureClusterIds);

			Cover cover = new Cover();
			cover.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OwnerId"));
			cover.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProjectName"));
			cover.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.DatasetName"));
			cover.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectType"));
			cover.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectId"));
			cover.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.UpdateTime"));
			cover.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CreateTime"));
			cover.setURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.URI"));
			cover.setOSSURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSURI"));
			cover.setFilename(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Filename"));
			cover.setMediaType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.MediaType"));
			cover.setContentType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentType"));
			cover.setSize(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Size"));
			cover.setFileHash(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileHash"));
			cover.setFileModifiedTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileModifiedTime"));
			cover.setFileCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileCreateTime"));
			cover.setFileAccessTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FileAccessTime"));
			cover.setProduceTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProduceTime"));
			cover.setLatLong(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.LatLong"));
			cover.setTimezone(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Timezone"));
			cover.setTravelClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.TravelClusterId"));
			cover.setOrientation(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Orientation"));
			cover.setFigureCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.FigureCount"));
			cover.setTitle(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Title"));
			cover.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageWidth"));
			cover.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageHeight"));
			cover.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.EXIF"));
			cover.setVideoWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoWidth"));
			cover.setVideoHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoHeight"));
			cover.setArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Artist"));
			cover.setAlbumArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AlbumArtist"));
			cover.setComposer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Composer"));
			cover.setPerformer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Performer"));
			cover.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Language"));
			cover.setAlbum(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Album"));
			cover.setPageCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.PageCount"));
			cover.setDocumentText(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.DocumentText"));
			cover.setETag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ETag"));
			cover.setCacheControl(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CacheControl"));
			cover.setContentDisposition(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentDisposition"));
			cover.setContentEncoding(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentEncoding"));
			cover.setContentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentLanguage"));
			cover.setAccessControlAllowOrigin(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AccessControlAllowOrigin"));
			cover.setAccessControlRequestMethod(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AccessControlRequestMethod"));
			cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryptionCustomerAlgorithm"));
			cover.setServerSideEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryption"));
			cover.setServerSideDataEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideDataEncryption"));
			cover.setServerSideEncryptionKeyId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ServerSideEncryptionKeyId"));
			cover.setOSSStorageClass(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSStorageClass"));
			cover.setOSSCRC64(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSCRC64"));
			cover.setObjectACL(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ObjectACL"));
			cover.setContentMd5(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.ContentMd5"));
			cover.setOSSUserMeta(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSUserMeta"));
			cover.setOSSTaggingCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSTaggingCount"));
			cover.setOSSTagging(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSTagging"));
			cover.setOSSExpiration(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSExpiration"));
			cover.setOSSVersionId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSVersionId"));
			cover.setOSSDeleteMarker(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSDeleteMarker"));
			cover.setOSSObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OSSObjectType"));
			cover.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CustomId"));
			cover.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Cover.CustomLabels"));
			cover.setStreamCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.StreamCount"));
			cover.setProgramCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.ProgramCount"));
			cover.setFormatName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FormatName"));
			cover.setFormatLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.FormatLongName"));
			cover.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.StartTime"));
			cover.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Bitrate"));
			cover.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Duration"));

			ImageScore12 imageScore12 = new ImageScore12();
			imageScore12.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.ImageScore.OverallQualityScore"));
			cover.setImageScore12(imageScore12);

			List<AddressesItem22> addresses13 = new ArrayList<AddressesItem22>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses.Length"); j++) {
				AddressesItem22 addressesItem22 = new AddressesItem22();
				addressesItem22.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Language"));
				addressesItem22.setAddressLine(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].AddressLine"));
				addressesItem22.setCountry(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Country"));
				addressesItem22.setProvince(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Province"));
				addressesItem22.setCity(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].City"));
				addressesItem22.setDistrict(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].District"));
				addressesItem22.setTownship(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Addresses["+ j +"].Township"));

				addresses13.add(addressesItem22);
			}
			cover.setAddresses13(addresses13);

			List<FiguresItem23> figures14 = new ArrayList<FiguresItem23>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures.Length"); j++) {
				FiguresItem23 figuresItem23 = new FiguresItem23();
				figuresItem23.setFigureId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureId"));
				figuresItem23.setFigureConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureConfidence"));
				figuresItem23.setFigureClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureClusterId"));
				figuresItem23.setFigureClusterConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureClusterConfidence"));
				figuresItem23.setFigureType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FigureType"));
				figuresItem23.setAge(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Age"));
				figuresItem23.setAgeSD(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].AgeSD"));
				figuresItem23.setGender(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Gender"));
				figuresItem23.setGenderConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].GenderConfidence"));
				figuresItem23.setEmotion(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Emotion"));
				figuresItem23.setEmotionConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].EmotionConfidence"));
				figuresItem23.setFaceQuality(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].FaceQuality"));
				figuresItem23.setMouth(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Mouth"));
				figuresItem23.setMouthConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].MouthConfidence"));
				figuresItem23.setBeard(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Beard"));
				figuresItem23.setBeardConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].BeardConfidence"));
				figuresItem23.setHat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Hat"));
				figuresItem23.setHatConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HatConfidence"));
				figuresItem23.setMask(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Mask"));
				figuresItem23.setMaskConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].MaskConfidence"));
				figuresItem23.setGlasses(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Glasses"));
				figuresItem23.setGlassesConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].GlassesConfidence"));
				figuresItem23.setSharpness(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Sharpness"));
				figuresItem23.setAttractive(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Attractive"));

				Boundary24 boundary24 = new Boundary24();
				boundary24.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Width"));
				boundary24.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Height"));
				boundary24.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Left"));
				boundary24.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].Boundary.Top"));
				figuresItem23.setBoundary24(boundary24);

				HeadPose25 headPose25 = new HeadPose25();
				headPose25.setPitch(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Pitch"));
				headPose25.setRoll(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Roll"));
				headPose25.setYaw(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Figures["+ j +"].HeadPose.Yaw"));
				figuresItem23.setHeadPose25(headPose25);

				figures14.add(figuresItem23);
			}
			cover.setFigures14(figures14);

			List<LabelsItem26> labels15 = new ArrayList<LabelsItem26>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels.Length"); j++) {
				LabelsItem26 labelsItem26 = new LabelsItem26();
				labelsItem26.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].Language"));
				labelsItem26.setLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelName"));
				labelsItem26.setLabelLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelLevel"));
				labelsItem26.setLabelConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].LabelConfidence"));
				labelsItem26.setParentLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].ParentLabelName"));
				labelsItem26.setCentricScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.Labels["+ j +"].CentricScore"));

				labels15.add(labelsItem26);
			}
			cover.setLabels15(labels15);

			List<CroppingSuggestionsItem27> croppingSuggestions16 = new ArrayList<CroppingSuggestionsItem27>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem27 croppingSuggestionsItem27 = new CroppingSuggestionsItem27();
				croppingSuggestionsItem27.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem27.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Confidence"));

				Boundary28 boundary28 = new Boundary28();
				boundary28.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary28.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary28.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary28.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem27.setBoundary28(boundary28);

				croppingSuggestions16.add(croppingSuggestionsItem27);
			}
			cover.setCroppingSuggestions16(croppingSuggestions16);

			List<OCRContentsItem29> oCRContents17 = new ArrayList<OCRContentsItem29>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents.Length"); j++) {
				OCRContentsItem29 oCRContentsItem29 = new OCRContentsItem29();
				oCRContentsItem29.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Language"));
				oCRContentsItem29.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Contents"));
				oCRContentsItem29.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Confidence"));

				Boundary30 boundary30 = new Boundary30();
				boundary30.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Width"));
				boundary30.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Height"));
				boundary30.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Left"));
				boundary30.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem29.setBoundary30(boundary30);

				oCRContents17.add(oCRContentsItem29);
			}
			cover.setOCRContents17(oCRContents17);

			List<VideoStreamsItem31> videoStreams18 = new ArrayList<VideoStreamsItem31>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams.Length"); j++) {
				VideoStreamsItem31 videoStreamsItem31 = new VideoStreamsItem31();
				videoStreamsItem31.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Index"));
				videoStreamsItem31.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Language"));
				videoStreamsItem31.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecName"));
				videoStreamsItem31.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecLongName"));
				videoStreamsItem31.setProfile(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Profile"));
				videoStreamsItem31.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTimeBase"));
				videoStreamsItem31.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTagString"));
				videoStreamsItem31.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].CodecTag"));
				videoStreamsItem31.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Width"));
				videoStreamsItem31.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Height"));
				videoStreamsItem31.setHasBFrames(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].HasBFrames"));
				videoStreamsItem31.setSampleAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].SampleAspectRatio"));
				videoStreamsItem31.setDisplayAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].DisplayAspectRatio"));
				videoStreamsItem31.setPixelFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].PixelFormat"));
				videoStreamsItem31.setLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Level"));
				videoStreamsItem31.setFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].FrameRate"));
				videoStreamsItem31.setAverageFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].AverageFrameRate"));
				videoStreamsItem31.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].TimeBase"));
				videoStreamsItem31.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].StartTime"));
				videoStreamsItem31.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Duration"));
				videoStreamsItem31.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Bitrate"));
				videoStreamsItem31.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].FrameCount"));
				videoStreamsItem31.setRotate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].Rotate"));
				videoStreamsItem31.setBitDepth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].BitDepth"));
				videoStreamsItem31.setColorSpace(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorSpace"));
				videoStreamsItem31.setColorRange(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorRange"));
				videoStreamsItem31.setColorTransfer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorTransfer"));
				videoStreamsItem31.setColorPrimaries(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.VideoStreams["+ j +"].ColorPrimaries"));

				videoStreams18.add(videoStreamsItem31);
			}
			cover.setVideoStreams18(videoStreams18);

			List<SubtitlesItem32> subtitles19 = new ArrayList<SubtitlesItem32>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles.Length"); j++) {
				SubtitlesItem32 subtitlesItem32 = new SubtitlesItem32();
				subtitlesItem32.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Index"));
				subtitlesItem32.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Language"));
				subtitlesItem32.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecName"));
				subtitlesItem32.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecLongName"));
				subtitlesItem32.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecTagString"));
				subtitlesItem32.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].CodecTag"));
				subtitlesItem32.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].StartTime"));
				subtitlesItem32.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Duration"));
				subtitlesItem32.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Bitrate"));
				subtitlesItem32.setContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Content"));
				subtitlesItem32.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Width"));
				subtitlesItem32.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.Subtitles["+ j +"].Height"));

				subtitles19.add(subtitlesItem32);
			}
			cover.setSubtitles19(subtitles19);

			List<AudioStreamsItem33> audioStreams20 = new ArrayList<AudioStreamsItem33>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams.Length"); j++) {
				AudioStreamsItem33 audioStreamsItem33 = new AudioStreamsItem33();
				audioStreamsItem33.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Index"));
				audioStreamsItem33.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Language"));
				audioStreamsItem33.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecName"));
				audioStreamsItem33.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecLongName"));
				audioStreamsItem33.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTimeBase"));
				audioStreamsItem33.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTagString"));
				audioStreamsItem33.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].CodecTag"));
				audioStreamsItem33.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].TimeBase"));
				audioStreamsItem33.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].StartTime"));
				audioStreamsItem33.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Duration"));
				audioStreamsItem33.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Bitrate"));
				audioStreamsItem33.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].FrameCount"));
				audioStreamsItem33.setLyric(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Lyric"));
				audioStreamsItem33.setSampleFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].SampleFormat"));
				audioStreamsItem33.setSampleRate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].SampleRate"));
				audioStreamsItem33.setChannels(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].Channels"));
				audioStreamsItem33.setChannelLayout(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioStreams["+ j +"].ChannelLayout"));

				audioStreams20.add(audioStreamsItem33);
			}
			cover.setAudioStreams20(audioStreams20);

			List<AudioCoversItem34> audioCovers21 = new ArrayList<AudioCoversItem34>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers.Length"); j++) {
				AudioCoversItem34 audioCoversItem34 = new AudioCoversItem34();
				audioCoversItem34.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageWidth"));
				audioCoversItem34.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageHeight"));
				audioCoversItem34.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].EXIF"));

				ImageScore35 imageScore35 = new ImageScore35();
				imageScore35.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].ImageScore.OverallQualityScore"));
				audioCoversItem34.setImageScore35(imageScore35);

				List<CroppingSuggestionsItem38> croppingSuggestions36 = new ArrayList<CroppingSuggestionsItem38>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem38 croppingSuggestionsItem38 = new CroppingSuggestionsItem38();
					croppingSuggestionsItem38.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem38.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary39 boundary39 = new Boundary39();
					boundary39.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary39.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary39.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary39.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem38.setBoundary39(boundary39);

					croppingSuggestions36.add(croppingSuggestionsItem38);
				}
				audioCoversItem34.setCroppingSuggestions36(croppingSuggestions36);

				List<OCRContentsItem40> oCRContents37 = new ArrayList<OCRContentsItem40>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem40 oCRContentsItem40 = new OCRContentsItem40();
					oCRContentsItem40.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem40.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem40.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary41 boundary41 = new Boundary41();
					boundary41.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary41.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary41.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary41.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Cover.AudioCovers["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem40.setBoundary41(boundary41);

					oCRContents37.add(oCRContentsItem40);
				}
				audioCoversItem34.setOCRContents37(oCRContents37);

				audioCovers21.add(audioCoversItem34);
			}
			cover.setAudioCovers21(audioCovers21);
			storiesItem.setCover(cover);

			List<FilesItem> files = new ArrayList<FilesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files.Length"); j++) {
				FilesItem filesItem = new FilesItem();
				filesItem.setOwnerId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OwnerId"));
				filesItem.setProjectName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProjectName"));
				filesItem.setDatasetName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].DatasetName"));
				filesItem.setObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectType"));
				filesItem.setObjectId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectId"));
				filesItem.setUpdateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].UpdateTime"));
				filesItem.setCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CreateTime"));
				filesItem.setURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].URI"));
				filesItem.setOSSURI(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSURI"));
				filesItem.setFilename(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Filename"));
				filesItem.setMediaType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].MediaType"));
				filesItem.setContentType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentType"));
				filesItem.setSize(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Size"));
				filesItem.setFileHash(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileHash"));
				filesItem.setFileModifiedTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileModifiedTime"));
				filesItem.setFileCreateTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileCreateTime"));
				filesItem.setFileAccessTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FileAccessTime"));
				filesItem.setProduceTime(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProduceTime"));
				filesItem.setLatLong(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].LatLong"));
				filesItem.setTimezone(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Timezone"));
				filesItem.setTravelClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].TravelClusterId"));
				filesItem.setOrientation(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Orientation"));
				filesItem.setFigureCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FigureCount"));
				filesItem.setTitle(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Title"));
				filesItem.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageWidth"));
				filesItem.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageHeight"));
				filesItem.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].EXIF"));
				filesItem.setVideoWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoWidth"));
				filesItem.setVideoHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoHeight"));
				filesItem.setArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Artist"));
				filesItem.setAlbumArtist(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AlbumArtist"));
				filesItem.setComposer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Composer"));
				filesItem.setPerformer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Performer"));
				filesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Language"));
				filesItem.setAlbum(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Album"));
				filesItem.setPageCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].PageCount"));
				filesItem.setDocumentText(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].DocumentText"));
				filesItem.setETag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ETag"));
				filesItem.setCacheControl(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CacheControl"));
				filesItem.setContentDisposition(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentDisposition"));
				filesItem.setContentEncoding(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentEncoding"));
				filesItem.setContentLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentLanguage"));
				filesItem.setAccessControlAllowOrigin(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AccessControlAllowOrigin"));
				filesItem.setAccessControlRequestMethod(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AccessControlRequestMethod"));
				filesItem.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryptionCustomerAlgorithm"));
				filesItem.setServerSideEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryption"));
				filesItem.setServerSideDataEncryption(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideDataEncryption"));
				filesItem.setServerSideEncryptionKeyId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ServerSideEncryptionKeyId"));
				filesItem.setOSSStorageClass(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSStorageClass"));
				filesItem.setOSSCRC64(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSCRC64"));
				filesItem.setObjectACL(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ObjectACL"));
				filesItem.setContentMd5(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ContentMd5"));
				filesItem.setOSSUserMeta(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSUserMeta"));
				filesItem.setOSSTaggingCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSTaggingCount"));
				filesItem.setOSSTagging(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSTagging"));
				filesItem.setOSSExpiration(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSExpiration"));
				filesItem.setOSSVersionId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSVersionId"));
				filesItem.setOSSDeleteMarker(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSDeleteMarker"));
				filesItem.setOSSObjectType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OSSObjectType"));
				filesItem.setCustomId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CustomId"));
				filesItem.setCustomLabels(_ctx.mapValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CustomLabels"));
				filesItem.setStreamCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].StreamCount"));
				filesItem.setProgramCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ProgramCount"));
				filesItem.setFormatName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FormatName"));
				filesItem.setFormatLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].FormatLongName"));
				filesItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].StartTime"));
				filesItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Bitrate"));
				filesItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Duration"));

				ImageScore imageScore = new ImageScore();
				imageScore.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].ImageScore.OverallQualityScore"));
				filesItem.setImageScore(imageScore);

				List<AddressesItem> addresses1 = new ArrayList<AddressesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses.Length"); k++) {
					AddressesItem addressesItem = new AddressesItem();
					addressesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Language"));
					addressesItem.setAddressLine(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].AddressLine"));
					addressesItem.setCountry(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Country"));
					addressesItem.setProvince(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Province"));
					addressesItem.setCity(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].City"));
					addressesItem.setDistrict(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].District"));
					addressesItem.setTownship(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Addresses["+ k +"].Township"));

					addresses1.add(addressesItem);
				}
				filesItem.setAddresses1(addresses1);

				List<FiguresItem> figures = new ArrayList<FiguresItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures.Length"); k++) {
					FiguresItem figuresItem = new FiguresItem();
					figuresItem.setFigureId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureId"));
					figuresItem.setFigureConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureConfidence"));
					figuresItem.setFigureClusterId(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureClusterId"));
					figuresItem.setFigureClusterConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureClusterConfidence"));
					figuresItem.setFigureType(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FigureType"));
					figuresItem.setAge(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Age"));
					figuresItem.setAgeSD(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].AgeSD"));
					figuresItem.setGender(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Gender"));
					figuresItem.setGenderConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].GenderConfidence"));
					figuresItem.setEmotion(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Emotion"));
					figuresItem.setEmotionConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].EmotionConfidence"));
					figuresItem.setFaceQuality(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].FaceQuality"));
					figuresItem.setMouth(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Mouth"));
					figuresItem.setMouthConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].MouthConfidence"));
					figuresItem.setBeard(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Beard"));
					figuresItem.setBeardConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].BeardConfidence"));
					figuresItem.setHat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Hat"));
					figuresItem.setHatConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HatConfidence"));
					figuresItem.setMask(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Mask"));
					figuresItem.setMaskConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].MaskConfidence"));
					figuresItem.setGlasses(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Glasses"));
					figuresItem.setGlassesConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].GlassesConfidence"));
					figuresItem.setSharpness(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Sharpness"));
					figuresItem.setAttractive(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Attractive"));

					Boundary boundary = new Boundary();
					boundary.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Width"));
					boundary.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Height"));
					boundary.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Left"));
					boundary.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].Boundary.Top"));
					figuresItem.setBoundary(boundary);

					HeadPose headPose = new HeadPose();
					headPose.setPitch(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Pitch"));
					headPose.setRoll(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Roll"));
					headPose.setYaw(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Figures["+ k +"].HeadPose.Yaw"));
					figuresItem.setHeadPose(headPose);

					figures.add(figuresItem);
				}
				filesItem.setFigures(figures);

				List<LabelsItem> labels = new ArrayList<LabelsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels.Length"); k++) {
					LabelsItem labelsItem = new LabelsItem();
					labelsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].Language"));
					labelsItem.setLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelName"));
					labelsItem.setLabelLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelLevel"));
					labelsItem.setLabelConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].LabelConfidence"));
					labelsItem.setParentLabelName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].ParentLabelName"));
					labelsItem.setCentricScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Labels["+ k +"].CentricScore"));

					labels.add(labelsItem);
				}
				filesItem.setLabels(labels);

				List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions.Length"); k++) {
					CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
					croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].AspectRatio"));
					croppingSuggestionsItem.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Confidence"));

					Boundary2 boundary2 = new Boundary2();
					boundary2.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Width"));
					boundary2.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Height"));
					boundary2.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Left"));
					boundary2.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].CroppingSuggestions["+ k +"].Boundary.Top"));
					croppingSuggestionsItem.setBoundary2(boundary2);

					croppingSuggestions.add(croppingSuggestionsItem);
				}
				filesItem.setCroppingSuggestions(croppingSuggestions);

				List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents.Length"); k++) {
					OCRContentsItem oCRContentsItem = new OCRContentsItem();
					oCRContentsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Language"));
					oCRContentsItem.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Contents"));
					oCRContentsItem.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Confidence"));

					Boundary3 boundary3 = new Boundary3();
					boundary3.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Width"));
					boundary3.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Height"));
					boundary3.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Left"));
					boundary3.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].OCRContents["+ k +"].Boundary.Top"));
					oCRContentsItem.setBoundary3(boundary3);

					oCRContents.add(oCRContentsItem);
				}
				filesItem.setOCRContents(oCRContents);

				List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams.Length"); k++) {
					VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
					videoStreamsItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Index"));
					videoStreamsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Language"));
					videoStreamsItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecName"));
					videoStreamsItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecLongName"));
					videoStreamsItem.setProfile(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Profile"));
					videoStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTimeBase"));
					videoStreamsItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTagString"));
					videoStreamsItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].CodecTag"));
					videoStreamsItem.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Width"));
					videoStreamsItem.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Height"));
					videoStreamsItem.setHasBFrames(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].HasBFrames"));
					videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].SampleAspectRatio"));
					videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].DisplayAspectRatio"));
					videoStreamsItem.setPixelFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].PixelFormat"));
					videoStreamsItem.setLevel(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Level"));
					videoStreamsItem.setFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].FrameRate"));
					videoStreamsItem.setAverageFrameRate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].AverageFrameRate"));
					videoStreamsItem.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].TimeBase"));
					videoStreamsItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].StartTime"));
					videoStreamsItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Duration"));
					videoStreamsItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Bitrate"));
					videoStreamsItem.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].FrameCount"));
					videoStreamsItem.setRotate(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].Rotate"));
					videoStreamsItem.setBitDepth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].BitDepth"));
					videoStreamsItem.setColorSpace(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorSpace"));
					videoStreamsItem.setColorRange(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorRange"));
					videoStreamsItem.setColorTransfer(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorTransfer"));
					videoStreamsItem.setColorPrimaries(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].VideoStreams["+ k +"].ColorPrimaries"));

					videoStreams.add(videoStreamsItem);
				}
				filesItem.setVideoStreams(videoStreams);

				List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles.Length"); k++) {
					SubtitlesItem subtitlesItem = new SubtitlesItem();
					subtitlesItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Index"));
					subtitlesItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Language"));
					subtitlesItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecName"));
					subtitlesItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecLongName"));
					subtitlesItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecTagString"));
					subtitlesItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].CodecTag"));
					subtitlesItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].StartTime"));
					subtitlesItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Duration"));
					subtitlesItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Bitrate"));
					subtitlesItem.setContent(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Content"));
					subtitlesItem.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Width"));
					subtitlesItem.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].Subtitles["+ k +"].Height"));

					subtitles.add(subtitlesItem);
				}
				filesItem.setSubtitles(subtitles);

				List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams.Length"); k++) {
					AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
					audioStreamsItem.setIndex(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Index"));
					audioStreamsItem.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Language"));
					audioStreamsItem.setCodecName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecName"));
					audioStreamsItem.setCodecLongName(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecLongName"));
					audioStreamsItem.setCodecTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTimeBase"));
					audioStreamsItem.setCodecTagString(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTagString"));
					audioStreamsItem.setCodecTag(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].CodecTag"));
					audioStreamsItem.setTimeBase(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].TimeBase"));
					audioStreamsItem.setStartTime(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].StartTime"));
					audioStreamsItem.setDuration(_ctx.doubleValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Duration"));
					audioStreamsItem.setBitrate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Bitrate"));
					audioStreamsItem.setFrameCount(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].FrameCount"));
					audioStreamsItem.setLyric(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Lyric"));
					audioStreamsItem.setSampleFormat(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].SampleFormat"));
					audioStreamsItem.setSampleRate(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].SampleRate"));
					audioStreamsItem.setChannels(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].Channels"));
					audioStreamsItem.setChannelLayout(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioStreams["+ k +"].ChannelLayout"));

					audioStreams.add(audioStreamsItem);
				}
				filesItem.setAudioStreams(audioStreams);

				List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers.Length"); k++) {
					AudioCoversItem audioCoversItem = new AudioCoversItem();
					audioCoversItem.setImageWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageWidth"));
					audioCoversItem.setImageHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageHeight"));
					audioCoversItem.setEXIF(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].EXIF"));

					ImageScore4 imageScore4 = new ImageScore4();
					imageScore4.setOverallQualityScore(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].ImageScore.OverallQualityScore"));
					audioCoversItem.setImageScore4(imageScore4);

					List<CroppingSuggestionsItem7> croppingSuggestions5 = new ArrayList<CroppingSuggestionsItem7>();
					for (int l = 0; l < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions.Length"); l++) {
						CroppingSuggestionsItem7 croppingSuggestionsItem7 = new CroppingSuggestionsItem7();
						croppingSuggestionsItem7.setAspectRatio(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].AspectRatio"));
						croppingSuggestionsItem7.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Confidence"));

						Boundary8 boundary8 = new Boundary8();
						boundary8.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Width"));
						boundary8.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Height"));
						boundary8.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Left"));
						boundary8.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].CroppingSuggestions["+ l +"].Boundary.Top"));
						croppingSuggestionsItem7.setBoundary8(boundary8);

						croppingSuggestions5.add(croppingSuggestionsItem7);
					}
					audioCoversItem.setCroppingSuggestions5(croppingSuggestions5);

					List<OCRContentsItem9> oCRContents6 = new ArrayList<OCRContentsItem9>();
					for (int l = 0; l < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents.Length"); l++) {
						OCRContentsItem9 oCRContentsItem9 = new OCRContentsItem9();
						oCRContentsItem9.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Language"));
						oCRContentsItem9.setContents(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Contents"));
						oCRContentsItem9.setConfidence(_ctx.floatValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Confidence"));

						Boundary10 boundary10 = new Boundary10();
						boundary10.setWidth(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Width"));
						boundary10.setHeight(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Height"));
						boundary10.setLeft(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Left"));
						boundary10.setTop(_ctx.longValue("QueryStoriesResponse.Stories["+ i +"].Files["+ j +"].AudioCovers["+ k +"].OCRContents["+ l +"].Boundary.Top"));
						oCRContentsItem9.setBoundary10(boundary10);

						oCRContents6.add(oCRContentsItem9);
					}
					audioCoversItem.setOCRContents6(oCRContents6);

					audioCovers.add(audioCoversItem);
				}
				filesItem.setAudioCovers(audioCovers);

				files.add(filesItem);
			}
			storiesItem.setFiles(files);

			List<AddressesItem11> addresses = new ArrayList<AddressesItem11>();
			for (int j = 0; j < _ctx.lengthValue("QueryStoriesResponse.Stories["+ i +"].Addresses.Length"); j++) {
				AddressesItem11 addressesItem11 = new AddressesItem11();
				addressesItem11.setLanguage(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].Language"));
				addressesItem11.setAddressLine(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].AddressLine"));
				addressesItem11.setCountry(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].Country"));
				addressesItem11.setProvince(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].Province"));
				addressesItem11.setCity(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].City"));
				addressesItem11.setDistrict(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].District"));
				addressesItem11.setTownship(_ctx.stringValue("QueryStoriesResponse.Stories["+ i +"].Addresses["+ j +"].Township"));

				addresses.add(addressesItem11);
			}
			storiesItem.setAddresses(addresses);

			stories.add(storiesItem);
		}
		queryStoriesResponse.setStories(stories);
	 
	 	return queryStoriesResponse;
	}
}